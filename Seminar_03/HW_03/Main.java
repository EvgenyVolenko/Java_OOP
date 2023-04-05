package Seminar_03.HW_03;

public class Main {
    public static void main(String[] args) {
        
    VectorList<Integer> vectorList = new VectorList<>();
    vectorList.add(1);
    vectorList.add(4);
    vectorList.add(6);
     vectorList.add(7);
     vectorList.add(15);

     for (Integer item : vectorList) {
        System.out.println(item);
     }

     VectorList<String> vectorString = new VectorList<>();
     vectorString.add("Первый");
     vectorString.add("Второй");

     for (String str : vectorString) {
        System.out.println(str);
     }
    }
}
