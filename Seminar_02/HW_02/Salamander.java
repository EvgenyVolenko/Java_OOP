package Seminar_02.HW_02;

public class Salamander extends Amphibian implements Walkable{

    public Salamander(String name) {
        super(name);
    }

    @Override
    public double swimmSpeed() {
        return 1.32;
    }

    @Override
    public String feed() {
        return "Насекомые";
    }

    @Override
    public double walkSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString())
                .append(String.format("Скорость бега: %s\n", this.walkSpeed()));
        return res.toString();
    }
}
