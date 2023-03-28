
public class Chips extends Product{

    private String taste;

    public Chips (String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }
    
    @Override
    public String toString() {
        return String.format("Чипсы \"%s\" со вкусом \"%s\" - %.2f руб. (Остаток в автомате %d шт.)", 
               super.getName(), this.taste, super.getPrice(), super.getValue());
    }
}