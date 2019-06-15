/*
 * Johnny Huang
 * CS 305 HW 0
 * Receipt.java
 * **REVISED** on 01/18/18
 */
public class Receipt 
{
    private RetailItem[] items;//intializing needed variables in accordance to given UML diagram
    private int numItems;
    private int maxItems;

    public Receipt(int maxItems)//Receipt constructor, taking in a given int parameter maxItems
    {
        if(maxItems<=0)//if parameter is 0 or a negative number...
        {
            this.maxItems = 20;//set the object's maxItem to 10
            //**REVISED** changed to 20
        }
        else if(maxItems>0)
        {
            this.maxItems = maxItems;//if it's a positive number, set it to that number
        }

        items = new RetailItem[this.maxItems];//creates RetailItem array with given parameter value
        numItems = 0;//array index and number of items in array so far is set to 0
    }

    public int addItem(RetailItem item)//adds an item to array
    {
        if(numItems>=maxItems)
        {
            System.out.println("Cannot add another item to receipt. Maximum size has been reached.");
            return -1;//if number of item is equal to its max size or somehow greater than, gives error
        }
        else
        {
            items[numItems] = item;//...otherwise, adds item at free index and increases index to next available one in array
            numItems++;
            return 0;
        }
    }

    public void printReceipt()//prints the entire receipt
    {
        int totalcost = 0;//total cost of items starts at 0
        System.out.println("Receipt:");
        for(int i = 0; i < items.length; i++)//for every item...
        {
            if(!(items[i]==null))//if the item exists in RetailItem array...
            {
                items[i].print();//print out its details
                totalcost = totalcost + items[i].getPrice();//...also, add its cost for each item as it goes by calling getPrice from Retailitem
            }
        }
        float costindollars = totalcost/(float)100;//calculates the amount in dollars and cents using float
        System.out.println("Total: " + costindollars);//prints out total cost
        System.out.println();
    }
}