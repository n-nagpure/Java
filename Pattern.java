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
public class Pattern {
    public static void printSquare(int n){
        for(int i=0;i<n; i++){
            for (int j=0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        printSquare(5);
    }
    
}
