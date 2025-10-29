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
class Multithread extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running.");
        }
        catch(Exception e){
            System.out.println("Exception caught"+ e);
        }
    }
}
public class MultiThreadingDemo {
    public static void main(String args[]){
        int n=3;
        for(int i=0; i<n;i++){
            Multithread obj=new Multithread();
            obj.start();
        }
    
    }
}
