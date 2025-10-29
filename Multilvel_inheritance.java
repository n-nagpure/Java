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
class Animal{
    void msg(){
    System.out.println("Eating.....");
    }
}
class Cat extends Animal{
    void message(){
        System.out.println("Meow......");
    }
}
class Dog extends Cat{
    void messages(){
        System.out.println("Barking.......");
    }
}
public class Multilvel_inheritance {
    public static void main(String args[]){
        Dog d=new Dog();
        d.msg();
        d.message();
        d.messages();
    } 
}
