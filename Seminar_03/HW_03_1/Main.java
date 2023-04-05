package Seminar_03.HW_03_1;

public class Main {
    public static void main(String[] args) {
        Llist list = new Llist();

        list = Llist.insert(list, 1);
        list = Llist.insert(list, 2);
        list = Llist.insert(list, 3);
        list = Llist.insert(list, 4);
        list = Llist.insert(list, 5);

        Llist.printList(list);
    }
}
