package Seminar_01.HW_01;

public class Main {
    public static void main(String[] args) {
        CofeMashine cm = new CofeMashine();
        cm.addDrink(new Drink("Вода",  200, 100, 5))
          .addDrink(new Cofe("Кофе", 200, 70, 80, "Капучино"))
          .addDrink(new Cofe("Кофе", 200, 90, 90, "Лате"))
          .addDrink(new Tea("Чай", 150, 95, 50, "Черный"))
          .addDrink(new Tea("Чай", 250, 85, 70.55, "Зеленый"));

        System.out.println("На начало дня !!!");
        System.out.println("Объем воды в машине " + cm.getRemainsVolume());
        System.out.println(cm);
    //     System.out.println();
    //     PrintSell(mart,"Lays");
    //     PrintSell(mart,"Московский кортофель");
    //     PrintSell(mart,"moloko");
    //     System.out.println();
    //     System.out.println("После продажи");
    //     System.out.println(mart);
    //     System.out.println();
    //     PrintSell(mart,"Lays");
    //     PrintSell(mart,"Фиговина");
    //     System.out.println();
    //     System.out.println(mart);
    // }

    // public static void PrintSell (VendingMachine machine, String nameProd){
    //     try{
    //         System.out.println("Продано - " + machine.sell(nameProd));
    //     } catch (Exception e) {
    //         System.out.println("Товар не найден");
    //     }
    }
}
