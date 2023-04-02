package Seminar_02.HW_02;

public abstract class Amphibian extends Animal implements Swimmable{

    public abstract double swimmSpeed();

    public Amphibian(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString())
                .append(String.format("Скорость плавания: %s\n", this.swimmSpeed()));
        return res.toString();
    }
}
