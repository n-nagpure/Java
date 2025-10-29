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
class Admin{
    void msg(){
    System.out.println("I am Admin");
    }
}
class Student extends Admin{
    void messenger(){
        System.out.println("I am student");
    }
}
class Teacher extends Admin{
    void message(){
        System.out.println("I am teacher");
    }
}
public class Hirarchical_inheritance {
    public static void main(String args[]){
        Teacher t=new Teacher();
        t.message();
        t.msg();
        Student s=new Student();
        s.messenger();
        s.msg();
    }
}
