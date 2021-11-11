package java_Assignment_1;

public class ArmStrong {

	public static void main(String[] args) {
		int num = 153,sum = 0,rem,temp=num;
		while(num > 0) {
			rem = num % 10;
			sum = sum + rem*rem*rem; 
			num = num/10;
		}
		if(temp==sum) {
		System.out.println(sum+" is armstrong");
		}
	else {
		System.out.println("number is not armstrong");
	}

	}

}