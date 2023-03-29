package Seminar_01.HW_01;

public class Tea extends Drink {
    
    private String teaType;

    public Tea (String name, int volume, int temp, double price, String teaType) {
        super(name, volume, temp, price);
        this.teaType = teaType;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" - \"%s\", температура %d C. Цена - %.2f руб.", 
               super.getName(), this.teaType, super.getTemp(), super.getPrice());
    }
}