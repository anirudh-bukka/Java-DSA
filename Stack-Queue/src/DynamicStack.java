public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // It will call CustomStack();
    }

    public DynamicStack(int size) {
        super(size); // It will call CustomStack(int size);
    }

    // In dynamic stack, every method of CustomStack class will be same except for `push(int item)`.

    @Override
    public boolean push(int item) {
        if(this.isFull()) {
            int[] newArray = new int[data.length * 2];

            // copy all previous items into newArray
            for(int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }

            data = newArray;
        }

        // At this point we know that the array is not full.
        // Insert
        return super.push(item);
    }
}
