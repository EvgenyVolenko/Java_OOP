package Seminar_02.HW_02;

public abstract class Animal {
    
    protected String name;
    public abstract String feed();

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Кличка животного: %s\n", this.name))
                .append(String.format("Корм: %s\n", feed()));

        return res.toString();
    }
}
