package Seminar_03.HW_03_1;

public class Llist {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Llist insert(Llist list, int data) {

        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(Llist list) {
        Node currNode = list.head;
        System.out.println("Наш список");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}
