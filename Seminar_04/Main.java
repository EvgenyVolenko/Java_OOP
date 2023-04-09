public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20), new HardShield(10)))
               .addPers(new Archer("Гуд", 100, new Bow(15), new HardShield(0)))
               .addPers(new Archer("Снайпер", 130, new Bow(25), new HardShield(25)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new StandartShield(5)))
                 .addPers(new Thief("Потрошитель", 100, new Knife(), new StandartShield(0)))
                 .addPers(new Thief("Тестер", 75, new Knife(), new StandartShield(10)));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);

        // Archer robin = new Archer("Робин", 50, new Bow(20));
        // Archer gud = new Archer("Гуд", 50, new Bow(50));
        // Battle fight = new Battle(robin, gud);
        // fight.run();
    }
}