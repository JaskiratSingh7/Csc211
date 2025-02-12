
public class Bank
{
    private double amount;
    private double[] list = new double[100];
    private int i=0;
    
    
    public void deposit(double a)
    {
        amount = amount + a;
        list[i] = a;
        i++;
        
    }
    
    public void withdrawal(double b)
    {
        amount = amount - b;
        list[i] = b*-1;
        i++;
    }
    
    public double[] listInteractions()
    {
        System.out.println("Your bank history is as follows:");
        for(int a = 0;a<i;a++)
        {
        System.out.println(list[a]);
        }
    }
    
}
