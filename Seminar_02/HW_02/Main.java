package Seminar_02.HW_02;

public class Main {
    public static void main(String[] args) {

        Terrarium ter = new Terrarium();
        ter.addAnimal(new Frog("Квака"));
        ter.addAnimal(new Karinca("Трудяга"));
        ter.addAnimal(new Kobra("Нагайна"));
        ter.addAnimal(new Salamander("Блестящая"));
        ter.addAnimal(new Termit("Древогрыз"));
        ter.addAnimal(new GrassSnake("Вася"));

        ter.showAll();
        System.out.println("Чемпион по ползанию:");
        System.out.println(ter.championByCrawl());
        System.out.println("Чемпион по плаванию:");
        System.out.println(ter.championBySwimm());
        System.out.println("Чемпион по бегу:");
        System.out.println(ter.championByWalk());
    }
}