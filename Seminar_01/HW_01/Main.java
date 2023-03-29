package Seminar_01.HW_01;

public class Main {
  public static void main(String[] args) {
    CofeMashine cm = new CofeMashine();
    cm.addDrink(new Drink("Вода", 200, 100, 5))
        .addDrink(new Cofe("Кофе", 200, 70, 80, "Капучино"))
        .addDrink(new Cofe("Кофе", 200, 90, 90, "Лате"))
        .addDrink(new Tea("Чай", 150, 95, 50, "Черный"))
        .addDrink(new Tea("Чай", 250, 85, 70.55, "Зеленый"));

    System.out.println("На начало дня !!!");
    System.out.println("Объем воды в машине " + cm.getRemainsVolume() + " мм.");
    System.out.println(cm);
    System.out.println();
    cm.PrintSell("Вода");
    cm.PrintSell("Лате");
    cm.PrintSell("Капучино");
    cm.PrintSell("Черный");
    cm.PrintSell("Зеленый");
    cm.PrintSell("Черный");
    cm.PrintSell("Красный");
    System.out.println();
    System.out.println("После продажи");
    System.out.println("Объем воды в машине " + cm.getRemainsVolume() + " мм.");
    System.out.println(cm);
  }
}