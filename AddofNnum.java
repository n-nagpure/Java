import java.util.*;
class AddofNnum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number=");
		int n=sc.nextInt();
		int c=n*(n+1)/2;
		System.out.print("Addition upto given number="+c);
	}
}