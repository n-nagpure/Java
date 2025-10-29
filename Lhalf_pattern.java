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
public class Lhalf_pattern {
    public static void main(String args[]){
        int i,j,n=5;
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  }

