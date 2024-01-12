import java.util.Scanner;
public class Palindrome_Number
{
	public  void Palindrome()
	{
		int No = 0,Dig = 0,Rev = 0,Temp = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Any Number => \n");
		No = s.nextInt();

		Temp = No;
		
		while(Temp > 0)
		{
			Dig = Temp % 10;
			Rev = (Rev*10)+Dig;
			Temp = Temp / 10;
		}
		if(Rev == No)
		{
			System.out.println("Given Number Is Palindrome ");
		}
		else
		{
			System.out.println("Given Number Is Not Palindrome Number ");
		}
		
	}
	public static void main(String [] args)
	{
		Palindrome_Number p = new Palindrome_Number();
		
		p.Palindrome();
	}
}
