package Seminar_01.HW_01;

import java.util.ArrayList;
import java.util.List;

public class CofeMashine {

    private List<Drink> drinkS = new ArrayList<>();
    private double money = 0;
    private int remainsVolume = 1050;

    public boolean sellVolume(Drink drink) {
        if (this.remainsVolume >= drink.getVolume()) {
            this.remainsVolume -= drink.getVolume();
            return true;
        } else {
            return false;
        }
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
            if (item.toString().contains(name)) {
                return item;
            }
        }
        return null;
    }

    public Drink sell(String name) {
        Drink target = searchDrink(name);
        if (this.sellVolume(target)) {
            this.money += target.getPrice();
        } 
        return target;
    }

    public void PrintSell(String nameProd) {
        try {
            if (remainsVolume >= searchDrink(nameProd).getVolume()) {
                System.out.println("Возьмите - " + sell(nameProd));
            } else {
                System.out.println("В аппарате закончилась вода!!!");
            }
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
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