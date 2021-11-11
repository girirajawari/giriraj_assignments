package ExceptionsPart;
import java.util.Scanner;
public class UnsupportException {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnsupportException1 {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		if(den==0) 
			throw new UnsupportException1(); 
		int c=num/den;
		System.out.println(c);
		scanner.close();
		
	}

}
