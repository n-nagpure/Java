import java.util.*;
class Calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number=");
		int a=sc.nextInt();
		System.out.print("Enter your Second number=");
		int b=sc.nextInt();
		int c=a+b;
		System.out.print("Addition of Two number="+c);
		int d=a-b;
		System.out.print("Substraction of Two number="+d);
	}
}