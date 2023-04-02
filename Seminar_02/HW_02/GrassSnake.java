package Seminar_02.HW_02;

public class GrassSnake extends Reptil {

    public GrassSnake(String name) {
        super(name);
    }

    @Override
    public int crawlSpeed() {
        return 5;
    }

    @Override
    public String feed() {
        return "Лягушки";
    }
}