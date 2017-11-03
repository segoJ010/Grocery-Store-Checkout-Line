import java.util.Random;

public class Customer
{
  private int serviceTime;
  
  //Constructor
  public Customer()
  {
    serviceTime = new Random().nextInt(5) + 1;
  }
  
  //GET Method 
  public int getServiceTime;
  {
    return serviceTime;
  }
  
  //Decrement servoceTime by 1
  public void decServiceTime()
  {
    serviceTime--;
  }
}  
