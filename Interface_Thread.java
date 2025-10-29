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
public class Interface_Thread implements Runnable {
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+ " is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
    public static void main(String args[]){
        for(int i=1; i<5;i++){
            Thread t=new Thread(new Interface_Thread());
            t.start();
        }
    }
}
