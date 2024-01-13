import java.util.Scanner;

public class Eligible_For_Vote {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int Age = 0;
		
		System.out.println("Enet Your Age = >");
		Age = obj.nextInt();
		
		if(Age >= 18)
		{
			System.out.println("It Is Eligible For Vote");
		}
		else
		{
			System.out.println("It Is Not Eligible For Vote");
		}
		
		
		
	}
}
