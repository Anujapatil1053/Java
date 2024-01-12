import java.util.Scanner;
public class Substraction
{
	public void Sub()
	{
		int No1;
		int No2;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A First Number => ");
		No1 = s.nextInt();
		
		System.out.println("Enter A Second Number => ");
		No2 = s.nextInt();


		int Sub = No1 - No2;

		System.out.println("Substraction Of " + No1 + " - " + No2 + " = "+Sub);

	}
	public static void main(String [] args)
	{
		Substraction obj = new Substraction();
		obj.Sub();
	}
}