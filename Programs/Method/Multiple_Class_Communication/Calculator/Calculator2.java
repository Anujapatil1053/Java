import java.util.Scanner;
public class Calculator2
{
	public void Substraction()
	{
		int No = 0,Sub = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Substraction Of Number To Add = >");

		for(int i = 1; i <= 5; i++) 
		{	
			No = s.nextInt();
			if(i == 1)
			{
				Sub = 2 * No;
				Sub = Sub - No;
			}
			if(No == 0)
			{
				break;
			}
			else
			{	
				Sub = Sub - No;
			}
			
		}
		System.out.println("Substraction Of "+Sub);
	}
	public static void main(String [] args)
	{
		Calculator Sub = new Calculator();
		Sub.Substraction();
	}
}