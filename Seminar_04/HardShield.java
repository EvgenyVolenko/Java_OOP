public class HardShield extends Shield {

    private String name;

    public HardShield(int weight) {
        super(weight);
        this.name = "Тяжелый";
    }

    @Override
    public int defens() {
        return 25;
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
