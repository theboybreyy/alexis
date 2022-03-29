
  /**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author @theboybreyy
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The price is given to customers
    //This field determines whether or not there is a bus around or not 
    private boolean isAround;
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;   
        isAround = true;
        
    }

  
  public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The price is given to customers
    //This field determines whether or not there is a bus around or not 
    private boolean isAround;
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;   
        isAround = true;
        
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }
    
    /**Adding an Accessor method that gets the Total
     * 
    */
    public int getTotal(){
         return total;
    }
    
    /**Completing the body of the setPrice method
     * 
    */
    public void setPrice(int cost){
        cost = price;
    }
    
    /**Completing the discount method
     * 
    */
    public void discount(int amount){
        int discount = price - amount;
    }
    
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**Prompt method to alert the user to enter a legal amount
     * 
    */
    public void prompt(){
        System.out.println("Please insert the correct amount of money");
    }
    
    /**Show Price method
     * 
    */
    public void showPrice(){
        System.out.println("The price of the ticket is "+ price +" cents.");
    }
    
    //Implementing the empty method
    public void empty(){
        total = 0;
    }
   
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    
    public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The price is given to customers
    //This field determines whether or not there is a bus around or not 
    private boolean isAround;
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;   
        isAround = true;
        
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("#################" get.date());
        System.out.println("#The Atomic DSH Bus Terminal ");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
