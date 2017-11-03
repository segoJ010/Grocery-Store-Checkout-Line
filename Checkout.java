import java.util.*;

public class Checkout
{
  static int = shoppers; 
  
  public static void main(String[] args)
  {
    Queue<customers> line = new LinkedList<Customer>(); //Queue being initialized; LinkedList initialized
    Random newShopper = new Random();
    
    int lineLength = 0; //assuming nobody is at the line at the start of the hour
    
    for(int c =0; c < 60; c++) 
    {
      if(newShopper.nextInt(4) == 0)
      {
        line.add(createNewShopper());
        System.out.println("New Shopper! Queue length is now: " + line.size());
      }
      
      if(line.size() > lineLength)
      {
        lineLength = line.size();
      }
      purchaseProcess(line);
      
      System.out.println("-----------------------------------------------"); //Means time is passing OR line being empty
      
    }
    
    private static void purchaseProcess(queue<customer> line) //
    {
      Iterator<Customer>purchaseProcess = lineIterator();
      if(purchaseProcess)
      {
        Customer shop = purchaseProcess.next();
        shop.decServiceTime(); //Decreases hour
        
        if(shop.getServicetime() == 0)
        {
          shoppers++;
          line.poll();
          System.out.println("Shopper has left! Queue length: + line.size());
        }
       }
     }  
     
     private static Customer createNewShopper()
     {
        return new Customer();
     }
} 
     
