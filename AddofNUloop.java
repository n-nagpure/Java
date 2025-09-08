import java.util.*;
class AddofNUloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number=");
		int n=sc.nextInt();
		int i,c=0;
		for(i=0;i<=n;i++){                                                             
			c+=i;
		}
		System.out.print("Addition upto given number="+c);
	}
}