package Seminar_01.HW_01;

public class Cofe extends Drink {

    private String cofeType;

    public Cofe(String name, int volume, int temp, double price, String cofeType) {
        super(name, volume, temp, price);
        this.cofeType = cofeType;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" - \"%s\", температура %d C. Цена - %.2f руб.", 
               super.getName(), this.cofeType, super.getTemp(), super.getPrice());
    }
}