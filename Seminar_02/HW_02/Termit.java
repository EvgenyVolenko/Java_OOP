package Seminar_02.HW_02;

public class Termit extends Insect {

    public Termit(String name) {
        super(name);
    }

    @Override
    public double walkSpeed() {
        return 0.02;
    }

    @Override
    public String feed() {
        return "Древесина, опавшие листья";
    }
}