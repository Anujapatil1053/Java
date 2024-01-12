import java.util.Scanner;
public class Prime_Number
{
	public void Prime()
	{
		int No = 0, i = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Any Number => \n");
		No = s.nextInt();
		
		for(i = 2; i < No; i++)
		{
			if(No % i == 0)
			{
				break;
			}
		}
		if(No == i)
		{
			System.out.println("It Is Prime Number ");
		}
		else
		{
			System.out.println("It Is Not Prime Number");
		}

		

	}
	public static void main(String [] args)
	{
		 Prime_Number obj = new  Prime_Number();
		 obj. Prime();
	}
}

