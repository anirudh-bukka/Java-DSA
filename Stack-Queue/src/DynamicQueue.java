public class DynamicQueue extends CustomCircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()) {
            // double the size of the array and then append.
            int[] temp = new int[data.length * 2];

            // copy all previous items in new array: `temp`.
            for (int i = 0; i < data.length; i++) { // This is not i'th item from the front, but i'th item from `first/front`.
                temp[i] = data[(first + i) % data.length];
            }
            first = 0;
            end = data.length;
            data = temp;
        }
        // At this point we know that the array is not full.
        return super.insert(item);
    }
}
