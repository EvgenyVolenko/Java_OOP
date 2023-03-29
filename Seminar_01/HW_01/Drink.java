package Seminar_01.HW_01;

public class Drink {

    private String name;
    private int volume;
    private int temp;
    private double price;
    
    
    public Drink(String name, int volume, int temp, double price) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemp() {
        return temp;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" - температура %d C. Цена - %.2f руб.", 
               this.name, this.temp, this.price);
    }
}
