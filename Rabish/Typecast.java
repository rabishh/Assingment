package Rabish;
import java.util.Scanner;

public class Typecast {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	System.out.println("enter any intiger to typecast ");
	int a = sc.nextInt();
	System.out.println("the number you entered is intiger type and converted into float = "+(float)a);
	System.out.println("the number you entered is intiger type and converted into short = "+(short)a);
	System.out.println("the number you entered is intiger type and converted into double = "+(double)a);
	System.out.println("the number you entered is intiger type and converted into byte = "+(byte)a);
	System.out.println("enter any float to typecast ");
	float b = sc.nextFloat();
	System.out.println("the number you entered is float type and converted into intiger = "+(int)b);
	System.out.println("the number you entered is float type and converted into short = "+(short)b);
	System.out.println("the number you entered is float type and converted into double = "+(double)b);
	System.out.println("the number you entered is float type and converted into byte = "+(byte)b);
	sc.close();
	
	}
	
}
