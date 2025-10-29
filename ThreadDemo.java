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
class MyThread extends Thread{
    public void run(){
        System.out.println("Running......");
    }
}
public class ThreadDemo {
    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();
    }
}

