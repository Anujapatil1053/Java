import java.util.Scanner;

public class Accpet_Two_Integer{
	
	public static void main(String[] args) {
		
		int No1 = 0,No2 = 0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter First Integer");
		No1 = obj.nextInt();
		
		System.out.println("Enter Second Integer");
		No2 = obj.nextInt();
		
		if(No1 == No2)
		{
			System.out.println(+No1+ " = " +No1+ " Are Equal");
		}
		else
		{
			System.out.println( + No1 + " = " +No2+" Are Not Equal");
		}
		
	}
}
