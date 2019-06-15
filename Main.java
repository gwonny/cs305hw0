
/**
 * Main class to test hw0 classes
 * Other classes include: Receipt and RetailItem that students should implement
 * 
 * CS 305, SPRING 2018
 * @author Tammy VanDeGrift 
 * @version January 2018
 */
public class Main {
    public static void main(String[] args) {
        // create Receipt objects
        Receipt shop = new Receipt(-3);  //should create a receipt with default of size 20
        Receipt fred = new Receipt(2);
        
        // create items
        RetailItem candy = new RetailItem(1001, "Snickers", 75);
        RetailItem coffee = new RetailItem(3033, "Starbucks Blend", 699);
        RetailItem cookie = new RetailItem(2222, "Chips Ahoy", 329);
        RetailItem shirt = new RetailItem(9212, "Large T Shirt", 1599);
        RetailItem eggs = new RetailItem(1234, "Dozen Eggs", 369);
        RetailItem oranges = new RetailItem(5545, "Clementines", 799);
        RetailItem bread = new RetailItem(3222, "Orowheat bread", 499);
        RetailItem grapes = new RetailItem(5122, "Red grapes", 549);
        RetailItem yogurt = new RetailItem(1121, "Vanilla yogurt", 75);
        RetailItem peanuts = new RetailItem(2121, "Planters Peanuts", 879);
        RetailItem shampoo = new RetailItem(4424, "Pantene Shampoo", 633);
        RetailItem giftCard = new RetailItem(8000, "Fred Meyer Gift Card", 5000);
        
        // put some items into Receipt (scanned for checkout)
        shop.addItem(candy);
        shop.addItem(coffee);
        shop.addItem(cookie);
        shop.addItem(shirt);
        
        // for write-up: draw picture of what shop's items looks like
        
        // print receipt
        shop.printReceipt();
        
        // put more items into Receipt
        shop.addItem(eggs);
        shop.addItem(eggs);
        shop.addItem(oranges);
        shop.addItem(bread);
        shop.addItem(grapes);
        
        // print receipt
        shop.printReceipt();
        
        // add items
        shop.addItem(yogurt);
        shop.addItem(peanuts);
        
        // print receipt
        shop.printReceipt();
        
        // add items to fred
        fred.addItem(coffee);
        fred.addItem(oranges);
        fred.printReceipt();
        
        // add another item
        fred.addItem(bread);
        
        // for write-up
        // System.out.println(fred);
        // System.out.println(shop);
        
        return;
    }
}