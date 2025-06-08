package data_structures.linkedlist;

import data_structures.linkedlist.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
