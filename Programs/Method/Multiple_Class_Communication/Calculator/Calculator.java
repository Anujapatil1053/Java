import java.util.Scanner;
public class Calculator
{
	int Add = 0;
	
	public void Addition()
	{
		int No = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Addition Of Number To Add = >");

		while(true)
		{	
			No = s.nextInt();
			if(No == 0)
			{
				break;
			}
			else
			{
				Add = Add + No;
			}
			
		}
		System.out.println("Addition Of "+ Add);
	}
	public void Substraction()
	{
		int No = 0,Sub = Add;

		Scanner s = new Scanner(System.in);

		System.out.println("Substraction Of Number To Add = >");

		for(int i = 1; true ; i++) //while(true) 
		{	
			No = s.nextInt();
			//if(i == 1)
			//{
				//Sub = 2 * No;
				//Sub = Sub - No;
			//}                      
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
		Calculator obj = new Calculator();
		obj.Addition(); 
		
		obj.Substraction();
	}
}