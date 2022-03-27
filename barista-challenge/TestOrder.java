public class TestOrder {

    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item("cappuccino", 3.00);
        Item item2 = new Item("Drip Coffee",2.20);
        Item item3 = new Item("Latte",3.50);
        Item item4 = new Item("Mocha Latte", 3.70);

        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders with customer's name
        Order order3 = new Order("Adam");
        Order order4 = new Order("Emmily");
        Order order5 = new Order("Jimmy");

        // Add at least 2 items to each of the orders using the addItem method you wrote, 
        // for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order3.addItem(item2);
        order2.addItem(item3);

        // Implement the getStatusMessage method within the Order class
        System.out.println(order3.getStatusMessage());

        // Test your agetStatusMessage functionality by setting some orders to ready and printing the messages for each order. 
        // For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order3.setReady(true); 
        System.out.println(order3.getStatusMessage());

        // The total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());

        // Implement the display method within the Order class
        // call the display method on all of your orders, like so: order3.display()
        // order3.addItem(item1);
        // order3.addItem(item4);
        // order3.addItem(item2);
        // order3.display();
    }
}