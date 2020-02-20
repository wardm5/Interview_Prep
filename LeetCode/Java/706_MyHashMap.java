//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Design a HashMap without using any built-in hash table libraries.

To be specific, your design should include these functions:

put(key, value) : Insert a (key, value) pair into the HashMap. If the value already
exists in the HashMap, update the value.

get(key): Returns the value to which the specified key is mapped, or -1 if this
map contains no mapping for the key.

remove(key) : Remove the mapping for the value key if this map contains the mapping
for the key.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class MyHashMap {
    private int size = 100000;
    private Entry[] map;
    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new Entry[size];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        Integer tempInt = new Integer(key);
        int hash = tempInt.hashCode() % size;
        if (map[hash] == null)
            map[hash] = new Entry(key, value);
        Entry temp = map[hash];
        while (temp.next != null) {
            System.out.println("values in map: " + temp.val);
            if (temp.key == key) {
                temp.val = value;
                return;
            }
            temp = temp.next;
        }
        temp.next = new Entry(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Integer tempInt = new Integer(key);
        int hash = tempInt.hashCode() % size;
        if (map[hash] == null)
            return -1;
        Entry temp = map[hash];
        while (temp.next != null) {
            if (temp.key == key) {
                return temp.val;
            }
            temp = temp.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Integer tempInt = new Integer(key);
        int hash = tempInt.hashCode() % size;
        if (map[hash] == null)
            return;
        Entry temp = map[hash];
        Entry prior = null;
        while (temp != null) {
            if (temp.key == key && prior != null) {
                prior.next = temp.next;
                return;
            } else if (temp.key == key && prior == null) {
                map[hash] = null;
                return;
            }
            prior = temp;
            temp = temp.next;
        }
    }
}

class Entry {
    public int key;
    public int val;
    public Entry next;
    public Entry(int key, int val) {
        this.key = key;
        this.val = val;
        next = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

/*
    Runtime: 26 ms, faster than 42.40% of Java online submissions for Design HashMap.
    Memory Usage: 44.3 MB, less than 100.00% of Java online submissions for Design HashMap.
*/
