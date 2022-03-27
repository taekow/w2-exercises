public class Mammal {
    protected int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Enery Level: " + energyLevel);

        return this.energyLevel;
    }

}
