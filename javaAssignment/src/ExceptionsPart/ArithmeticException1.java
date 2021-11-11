package ExceptionsPart;
import java.util.Scanner;
public class ArithmeticException1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int denom = scanner.nextInt();
		try {
			int c=num/denom;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Kindly don't provide the denominator value zero");
		}
		scanner.close();
	}
}
