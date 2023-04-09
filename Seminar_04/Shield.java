public abstract class Shield implements Protection {
    
    int weight;

    public Shield(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getDefens() {
        if (weight == 0) {
            return 0;
        }
        return this.defens();
    }

    @Override
    public String toString() {
        if (weight == 0) {
            return "Отсутствует";
        }
        return String.format(" щит весом %d с уровнем защиты %d", this.weight, getDefens());
    }
}
