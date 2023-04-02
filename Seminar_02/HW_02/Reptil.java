package Seminar_02.HW_02;

public abstract class Reptil extends Animal implements Crawlable{

    public abstract int crawlSpeed();

    public Reptil(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(super.toString())
                .append(String.format("Скорость ползания: %s\n", this.crawlSpeed()));
        return res.toString();
    }
}
