import java.util.*;
class Leap_Year{
	public static void main(String args[]){
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