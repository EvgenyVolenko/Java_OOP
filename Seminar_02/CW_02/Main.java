public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cow("Бурёнка"));
        zoo.addAnimal(new Bear("М.Потапыч", 60));
        zoo.addAnimal(new Platypus("Пэрри"));
        zoo.addAnimal(new Woof("Серый"));
        zoo.addAnimal(new Goat("Маня"));
        zoo.addAnimal(new Bat("Микки"));
        zoo.addAnimal(new Bear("Косолапыч", 61));
        zoo.addAnimal(new Dolphin("Кузя"));
        zoo.addAnimal(new Shark("Дени", 19));
        

        // zoo.showAll();
        // System.out.println();
        // System.out.println("Чемпион по бегу: ");
        // System.out.println(zoo.championByRun());
        // System.out.println();
        // System.out.println("Чемпион по полёту: ");
        // System.out.println(zoo.championByFly());
        zoo.swimablePrint();
        System.out.println("Чемпион по плаванию: ");
        System.out.println(zoo.championBySwim());
    }
}