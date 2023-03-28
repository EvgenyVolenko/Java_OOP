public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("bread", 35, 10))
                .addProduct(new Milk("moloko", 50, 2))
                .addProduct(new Product("cheese", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20,3, "Ореховый"))
                .addProduct(new Chips("Московский кортофель", 63.45, 3, "Зелень"))
                .addProduct(new Chips("Lays", 55.20, 2, "С солью"));

        System.out.println("До продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Lays");
        PrintSell(mart,"Московский кортофель");
        PrintSell(mart,"moloko");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Lays");
        PrintSell(mart,"Фиговина");
        System.out.println();
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println("Продано - " + machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}