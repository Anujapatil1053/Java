import java.util.Scanner;
public class ArmPalNumber
{
	public void Armstrong()
	{
		int No = 0, Dig = 0, DCnt = 0, Temp = 0,Res = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Any Number => \n");
		No = s.nextInt();

		Temp = No;

		while(Temp > 0)
		{
			Temp= Temp /10; 
			DCnt++;
			
		}
		Temp = No;
		while(Temp > 0)
		{
			Dig = Temp % 10;
			Res = Res+((int)Math.pow(Dig,DCnt));
			Temp = Temp / 10; 
		}
		if(No == Res)
		{
			System.out.println("Given Number Is Armstrong Number ");
		}
		else
		{
			System.out.println("Given Number Is Not Armstrong Number ");
		}
	}
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
		if(No == Rev)
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
		ArmPalNumber A = new ArmPalNumber();
		A.Armstrong();

		ArmPalNumber p = new ArmPalNumber();
		
		p.Palindrome();
	}
}
