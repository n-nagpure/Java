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
class Emp{
    float salary=40000;
}
class Prg extends Emp{
    int bonus=10000;
}
public class Single_inhertance extends Emp{
    public static void main(String args[]){
          Prg p= new Prg();
          System.out.println("Programmer Salary=" + p.salary);
          System.out.println("Programmer Bonus=" + p.bonus);     
    }
}
