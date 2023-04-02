package Seminar_02.HW_02;

public class Frog extends Amphibian {

    public Frog(String name) {
        super(name);
    }

    @Override
    public double swimmSpeed() {
        return 6.48;
    }

    @Override
    public String feed() {
        return "Комары";
    }
    
}
