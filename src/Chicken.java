public class Chicken implements Animal {
    private int eggPerSec;
    private int weight;

    public Chicken(int eggPerSec, int weight) {
        this.eggPerSec = eggPerSec;
        this.weight = weight;
    }

    public int getEggPerSec() {
        return eggPerSec;
    }

    public void setEggPerSec(int eggPerSec) {
        this.eggPerSec = eggPerSec;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
