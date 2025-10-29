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
public class Fibonac {
    public static void main(String args[]){
        int first=0;
        int second=1;
        for (int i=0;i<=10;i++){
            System.out.print(first+" ");
            int count=first+second;
            first=second;
            second = count;
            
        }
    }
}
