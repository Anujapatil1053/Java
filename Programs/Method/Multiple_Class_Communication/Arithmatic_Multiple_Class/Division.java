import java.util.Scanner;
public class Division
{
	public void Div()
	{
		int No1 = 20;
		int No2 = 10;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter A First Number => ");
		No1 = s.nextInt();
		
		System.out.println("Enter A Second Number => ");
		No2 = s.nextInt();

		int Div = No1 / No2;

		System.out.println("Division Of " + No1 + " / " + No2 + " = "+Div);

	}
	public static void main(String [] args)
	{
		Division obj = new Division();
		obj.Div();
	}
}