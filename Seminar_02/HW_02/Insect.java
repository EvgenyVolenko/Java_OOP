package Seminar_02.HW_02;

public abstract class Insect extends Animal implements Walkable {

    public abstract double walkSpeed();

    public Insect(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString())
                .append(String.format("Скорость ползания: %s\n", this.walkSpeed()));
        return res.toString();
    }
    
}
