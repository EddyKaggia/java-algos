package data_structures.hashtable;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public class Node {
        private String key;
        private int value;
        private Node next;

        Node (String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }
}
