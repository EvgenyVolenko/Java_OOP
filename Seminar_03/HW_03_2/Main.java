package Seminar_03.HW_03_2;

public class Main {
    public static void main(String[] args) {
        LinkedL<String> test = new LinkedL<>();
        test.addFirst("a");
        test.addFirst("b");
        test.addFirst("c");
        test.addFirst("d");
        test.addFirst("e");
        test.addLast("f");
        test.addLast("g");
        test.addFirst("Я");

        System.out.println(test.size());
        
        for (String str : test) {
            System.out.println(str);
        }
    }
}
