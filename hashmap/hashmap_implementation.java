package hashmap;

import java.util.*;

public class hashmap_implementation {
    static class hashmap<k, v> {
        class node {
            k key;
            v value;

            public node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // size of array;
        private int N; // number of element
        private LinkedList<node> bucket[]; // n = bucket.length;

        @SuppressWarnings("unchecked")
        public hashmap() {
            this.n = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        private int hashfuction(k key) {
            int k = key.hashCode();
            return Math.abs(k) % n;
        }

        private int searchinll(k key, int bi) {
            LinkedList<node> ll = bucket[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public void rehashing() {
            LinkedList<node> oldbucket[] = bucket;
            bucket = new LinkedList[N * 2];
            this.n = N * 2; // Update the array size
            for (int i = 0; i < n; i++) {
                bucket[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    put(ll.get(j).key, ll.get(j).value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashfuction(key);
            int di = searchinll(key, bi);

            if (di != -1) {
                bucket[bi].get(di).value = value;
            } else {
                bucket[bi].add(new node(key, value));
                N++;
            }

            double lyamda = (double) n / N;
            if (lyamda > 2.0) {
                rehashing();
            }
        }

        public boolean containsKey(k key) {
            int bi = hashfuction(key);
            int di = searchinll(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public v remove(k key) {
            int bi = hashfuction(key);
            int di = searchinll(key, bi);

            if (di != -1) {
                node newnode = bucket[bi].remove(di);
                N--;
                return newnode.value;
            } else {
                return null;
            }
        }

        public v get(k key) {
            int bi = hashfuction(key);
            int di = searchinll(key, bi);

            if (di != -1) {
                node newnode = bucket[bi].get(di);
                return newnode.value;
            } else {
                return null;
            }
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public ArrayList<k> keyset() {
            ArrayList<k> keys = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<node> ll = bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }
    }

    public static void main(String arg[]) {
        hashmap<String, Integer> map = new hashmap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keyset();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
