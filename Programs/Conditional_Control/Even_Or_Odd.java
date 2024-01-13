import java.util.Scanner;

public class Even_Or_Odd {
			
	public static void main(String[] args) {
				
		int No = 0;
				
		Scanner obj = new Scanner(System.in);
				
		System.out.println("Enter Number => ");
		No = obj.nextInt();
			
		if(No % 2 == 0)
		{
			System.out.println(+ No + " Is Even");
		}
		else
		{
			System.out.println(+ No + " Is Odd");

		}
	}		
				
}
