package data_structures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(7);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());


//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//
//
//        myLinkedList.printList();
    }
}
