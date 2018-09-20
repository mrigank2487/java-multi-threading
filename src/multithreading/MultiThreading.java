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

class A extends Thread
{
    public void run()
    {
        for (int i=1; i<=200; i++)
            System.out.println("From Thread A: i= "+i);
        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run()
    {
        for (int j=1; j<=200; j++)
            System.out.println("From Thread B: j= "+j);
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        for (int k=1; k<=200; k++)
            System.out.println("From Thread C: j= "+k);
        System.out.println("Exit from C");
    }
}

public class MultiThreading 
{
    public static void main(String[] args) 
    {
        new A().start();
        new B().start();
        new C().start();
    }
    
}
