/*
 * Johnny Huang
 * CS 305 HW 0
 * RetailItem.java
 * **REVISED** on 01/18/18
 */
public class RetailItem {
    private int number;//initializes needed variables
    private String name;
    private int price;

    public RetailItem(int number, String name, int price)//constructor requiring the item number, its name, and its price
    {
        this.number = number;//assigns parameters to object's variables as accordingly
        this.name = name;
        this.price = price;
    }

    public void print()//is called from Receipt
    {
        float costindollars = price/(float)100;//calculates cost in dollars and cents
        //System.out.println("Item " + number + "    " + name + "     $" + costindollars);//prints out its details
        System.out.format("Item %d      %16s      $%.2f\n", number, name, costindollars);//**REVISED** System.out.format is now used to align cost printouts along same row
    }

    public int getPrice()
    {
        return price;//is used by Receipt to calculate total cost
    }   
}