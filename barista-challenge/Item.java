public class Item {
    private String name;
    private double price;

    public Item() {}

    // Add a constructor to your Item class that takes a String name and double price as arguments to set the name and price
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    // getter
    public double getPrice() {
        return price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
            
    }
}
