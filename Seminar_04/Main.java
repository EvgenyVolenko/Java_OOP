public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();

        Archer robin = new Archer("Робин", 50, new Bow(20), new HardShield(10));
        Archer gud = new Archer("Гуд", 70, new Bow(15), new StandartShield(10));
        Archer sniper = new Archer("Снайпер", 80, new Bow(25), new HardShield(25));

        Thief djek = new Thief("Джек", 100, new Knife(), new StandartShield(5));
        Thief potr = new Thief("Потрошитель", 30, new Knife(), new StandartShield(0));
        Thief tester = new Thief("Тестер", 55, new Knife(), new StandartShield(10));

        archers.addPers(robin)
               .addPers(gud)
               .addPers(sniper);
        thiefTeam.addPers(djek)
                 .addPers(potr)
                 .addPers(tester);
                 
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();
    
        Battle fight = new Battle(gud, djek);
        fight.run();
    }
}