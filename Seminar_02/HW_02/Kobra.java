package Seminar_02.HW_02;

public class Kobra extends Reptil {

    public Kobra(String name) {
        super(name);
    }

    @Override
    public int crawlSpeed() {
        return 6;
    }

    @Override
    public String feed() {
        return "Грызуны";
    }
    
}
