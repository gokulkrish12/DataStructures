package linked_list;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(7);
        myLinkedList.printList();

        System.out.println("-----------------------------------------------------------------------------------");

        myLinkedList.removeLast();
        myLinkedList.printList();

        System.out.println("-----------------------------------------------------------------------------------");

        myLinkedList.prepend(56);
        myLinkedList.printList();


    }
}
