package Seminar_01.HW_01;

import java.util.ArrayList;
import java.util.List;

public class CofeMashine {

    private List<Drink> drinkS = new ArrayList<>();
    private double money = 0;
    private int remainsVolume = 1000;

    public boolean sellVolume() {
        this.remainsVolume -= 200;
        return remainsVolume > 0;
    }

    public int getRemainsVolume() {
        return remainsVolume;
    }

    public CofeMashine addDrink(Drink drink) {
        drinkS.add(drink);
        return this;
    }

    public Drink searchDrink(String name) {
        for (Drink item : drinkS) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Drink sell(String name) throws Exception {
        Drink target = searchDrink(name);
        try {
            if (!this.sellVolume()){
                System.out.println("Возьмите свой " + target.getName());
            }
            this.money += target.getPrice();
        } catch (NullPointerException e) {
            throw new Exception("В аппарате закончилась вода!!!", e);
        }
        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Drink item : drinkS) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }

}
