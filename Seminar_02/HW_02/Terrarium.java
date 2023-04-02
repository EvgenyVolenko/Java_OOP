package Seminar_02.HW_02;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animal> animals = new ArrayList<>();
    
    public void addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    public void showAll() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }

    private List<Swimmable> swimmers() {
        List<Swimmable> res = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                res.add((Swimmable) animal);
            }
        }
        return res;
    }

    public Animal championBySwimm() {
        List<Swimmable> listS = swimmers();
        Swimmable champ = listS.get(0);
        for (Swimmable swimmer : listS) {
            if (champ.swimmSpeed() < swimmer.swimmSpeed()) {
                champ = swimmer;
            }
        }
        return (Animal) champ;
    }

    private List<Crawlable> crawlers() {
        List<Crawlable> res = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Crawlable) {
                res.add((Crawlable) animal);
            }
        }
        return res;
    }

    public Animal championByCrawl() {
        List<Crawlable> listC = crawlers();
        Crawlable champ = listC.get(0);
        for (Crawlable crawler : listC) {
            if (champ.crawlSpeed() < crawler.crawlSpeed()) {
                champ = crawler;
            }
        }
        return (Animal) champ;
    }

    private List<Walkable> walkers() {
        List<Walkable> res = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    public Animal championByWalk() {
        List<Walkable> listW = walkers();
        Walkable champ = listW.get(0);
        for (Walkable walker : listW) {
            if (champ.walkSpeed() < walker.walkSpeed()) {
                champ = walker;
            }
        }
        return (Animal) champ;
    }
}
