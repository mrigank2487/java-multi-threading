
class X implements Runnable
{
    public void run()
    {
        for (int j=1; j<=200; j++)
        {
            System.out.println("From Thread X: j= "+j);
            
        }
        System.out.println("Exit from X");
    }
}
public class RunnableTest 
{
    public static void main (String args[])
    {
        X runnable = new X();
        Thread threadX = new Thread(runnable);
        threadX.start();
        System.out.println("End of Main Thread");
    }
}
