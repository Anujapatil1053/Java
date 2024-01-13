import java.util.Scanner;

public class Negative_Positive_Zero {
	
	public static void main(String[] args) {
		
		int Num = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		Num = obj.nextInt();
		if(Num > 0)
		{
			System.out.println("Number Is Positive" +Num);
			
		}
		else if(Num < 0 )
		{
			System.out.println("Number Is Negative" +Num);
		}
		else
		{
			System.out.println("Number Is Zero" +Num);
		}
	}
}
