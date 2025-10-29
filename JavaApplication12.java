package javaapplication12;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Year to check Leap Year or not=");
	int year=sc.nextInt();
	if(year % 4 == 0 ||  year % 400 == 0 && year % 100 !=0){
		System.out.println("Enter Year is Leap Year");
	}
	else{
		System.out.println("Enter Year is not Leap Year");
	}
    }
    
}
