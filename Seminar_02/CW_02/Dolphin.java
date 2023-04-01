public class Dolphin extends Mammal implements Swimable {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ке-Ке-Ке";
    }

    @Override
    public int swimSpeed() {
        return 35;
    }

    @Override
    public String feed() {
        return "Рыба";
    }
}
