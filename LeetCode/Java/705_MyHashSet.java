//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
705. Design HashSet
Easy

Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

add(value): Insert a value into the HashSet.
contains(value) : Return whether the value exists in the HashSet or not.
remove(value): Remove a value in the HashSet. If the value does not exist in the
HashSet, do nothing.

Example:

MyHashSet hashSet = new MyHashSet();
hashSet.add(1);
hashSet.add(2);
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);
hashSet.contains(2);    // returns true
hashSet.remove(2);
hashSet.contains(2);    // returns false (already removed)

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Designed HashSet based on computer science principles
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class MyHashSet {
    private Node[] arr;
    private int size = 100000;
    /** Initialize your data structure here. */
    public MyHashSet() {
        arr = new Node[size];
    }

    public void add(int key) {
        int hash = Integer.hashCode(key) % size;
        arr[hash] = new Node(key);
    }

    public void remove(int key) {
        int hash = Integer.hashCode(key) % size;
        arr[hash] = null;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = Integer.hashCode(key) % size;
        return (arr[hash] != null);
    }
}
class Node {
    public int val;
    public Node(int val) {
        this.val = val;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

/*
    Runtime: 12 ms, faster than 86.93% of Java online submissions for Design HashSet.
    Memory Usage: 45.2 MB, less than 100.00% of Java online submissions for Design HashSet.
*/
