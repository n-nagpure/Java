/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author User
 */

public class IsAlive_Example extends Thread {
    public void run(){
        System.out.println("geeks");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        IsAlive_Example c1=new IsAlive_Example();
        IsAlive_Example c2=new IsAlive_Example();
        IsAlive_Example c3=new IsAlive_Example();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
        System.out.println(c3.isAlive());
    }
    
}
