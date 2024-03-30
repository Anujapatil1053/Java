import java.util.Scanner;

public class Leap_Year {
	
	public static void main(String[] args) {
		
		int Year = 0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Year");
		Year = obj.nextInt();
		
		if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0)
		{
			System.out.println(+ Year +" Is Leap Year");
		}
		else
		{
			System.out.println(+ Year +" Is Not Leap Year");
		}
	}
}
