public class Shark extends Fish implements Swimable {

    private int speed;

    public Shark(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "Только всплески воды";
    }

    @Override
    public String feed() {
        return "Ракообразные";
    }

    @Override
    public int swimSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString())
           .append(String.format("Скорость плавания: %s\n", this.swimSpeed()));
           return res.toString();
    }
}
