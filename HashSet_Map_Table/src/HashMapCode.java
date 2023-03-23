import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node { // --> This defines the LinkedList's Node
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // No. of nodes
        private int N; // No. of buckets
        private LinkedList<Node> buckets[]; // buckets --> Array of LinkedLists : similar to Array of integers.

        @SuppressWarnings("unchecked") // to get rid of warning messages due to any deprecated (yet legal) functionalities/features.
        public HashMap() { // Instantiating a HashMap
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++)
                this.buckets[i] = new LinkedList<>();
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i < N*2; i++)
                buckets[i] = new LinkedList<>();

            for(int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for(int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for(int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key)
                    return i;
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di == -1) {// --> When key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else { // --> when a key already exists, it is updated
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)(n/N);
            if(lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di == -1)
                return null;
            else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di == -1)
                return false;
            else
                return true;
        }

        public V remove(K key) {
            if(!containsKey(key))
                return null;

            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1)
                return null;
            else {
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("China", 130);
        map.put("US", 30);

        System.out.println(map.get("India"));

//        ArrayList<String> keys = map.keySet();
        System.out.println(map.keySet());

        ArrayList<String> keysAL = map.keySet();
        for(int i = 0; i < keysAL.size(); i++)
            System.out.println(keysAL.get(i) + " " + map.get(keysAL.get(i)));
    }
}
