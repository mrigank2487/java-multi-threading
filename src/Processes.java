/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithreading;

/**
 *
 * @author Sandeep
 */

class X extends Thread
{
    public void run()
    {
        for (int i=1; i<=200; i++)
        {
            if (i==100) yield();
            System.out.println("From Thread X: i= "+i);
            
        }
        System.out.println("Exit from X");
    }
}

class Y extends Thread
{
    public void run()
    {
        for (int j=1; j<=200; j++)
        {
            System.out.println("From Thread Y: j= "+j);
            if(j==70) stop();
        }
        System.out.println("Exit from Y");
    }
}

class Z extends Thread
{
    public void run()
    {
        for (int k=1; k<=200; k++)
        {
            System.out.println("From Thread Z: j= "+k);
            if(k==10)
            {
                try
                {
                    sleep(2000);
                }
                catch (Exception e)
                {     
                }
            }
        }
        System.out.println("Exit from Z");
    }
}

public class Processes 
{
    public static void main(String[] args) 
    {
        X ThreadX= new X();
        Y ThreadY= new Y();
        Z ThreadZ= new Z();
        
        System.out.println("Start Thread X");
        ThreadX.start();
        System.out.println("Start Thread Y");
        ThreadY.start();
        System.out.println("Start Thread Z");
        ThreadZ.start();
        
    }
    
}
