import java.util.Scanner;
public class Addition_Using_User_Input
{
	int No1,No2;	
	int Add;

	public void Userinput()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number = >");
		 No1 = s.nextInt();

		System.out.println("Enter Second Number = >");
		 No2 = s.nextInt();
		
		//Addition_Using_User_Input obj2 = new Addition_Using_User_Input();
		//obj2.Addition();
		//Addition();
		this.Addition();
	}
	public void Addition()
	{
		Add = No1 + No2;

		System.out.println("Addition Of " + No1 + " + " + No2 + " = "+Add);
	}
	public static void main(String [] args)
	{
		Addition_Using_User_Input obj1 = new Addition_Using_User_Input();
		obj1.Userinput();	
		
	}
}