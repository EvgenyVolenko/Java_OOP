package Seminar_02.HW_02;

public class Karinca extends Insect {

    public Karinca(String name) {
        super(name);
    }

    @Override
    public double walkSpeed() {
        return 1.8;
    }

    @Override
    public String feed() {
        return "Листья, трава";
    }

}
