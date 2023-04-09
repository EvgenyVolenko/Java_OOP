public abstract class Shield implements Protection {
    
    int weight;

    public Shield(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getDefens() {
        return this.defens();
    }

    @Override
    public String toString() {
        if (getWeight() == 0) {
            return "Отсутствует";
        }
        return String.format(" щит весом %d с уровнем защиты %d", this.weight, getDefens());
    }
}
