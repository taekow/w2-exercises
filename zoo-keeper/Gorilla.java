public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    
    public void throwSomething() {
        System.out.println("Gorilla has throw a piece of wood");
        this.energyLevel -= 5;

    }

    public void eatBanana() {
        System.out.println("Gorilla ate bananas");
        this.energyLevel += 10;

    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree");
        this.energyLevel -= 10;

    }

}
