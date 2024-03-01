import java.util.Scanner;

public class Divisible_By {
	
	public static void main(String[] args) {
		
		int No = 0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Number => ");
		No = obj.nextInt();
		
		if(No % 5 == 0)
		{
			System.out.println("Number Is Divisible by 5 ");
		}
		else if(No % 11 == 0)
		{
			System.out.println(" divisible by 11");
		}
		else
		{
			System.out.println(" No Is Not Divisible  by 5 And  11");
		}
	}
}
