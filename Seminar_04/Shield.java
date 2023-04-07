public abstract class Shield implements Protection {
    
    int weight;

    public Shield(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Shield [weight=" + weight + "]";
    }
}
