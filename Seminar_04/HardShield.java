public class HardShield extends Shield {

    private String name;

    public HardShield(int weight) {
        super(weight);
        this.name = "Тяжелый";
    }

    @Override
    public int defens() {
        if (weight == 0) {
            return 0;
        }
        return 12;
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
