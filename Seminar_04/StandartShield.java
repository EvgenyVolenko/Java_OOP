public class StandartShield extends Shield {

    private String name;

    public StandartShield(int weight) {
        super(weight);
        this.name = "Стандартный";
    }

    @Override
    public int defens() {
        if (weight == 0) {
            return 0;
        }
        return 10;
    }

    @Override
    public String toString() {
        if (super.weight == 0) {
            return "Отсутствует";
        }
        StringBuilder res = new StringBuilder();
        res.append(name);
        res.append(super.toString());
        return res.toString();
    }
}
