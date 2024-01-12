import java.util.Scanner;
public class Multiplication
{
	public void Mul()
	{
		int No1;
		int No2;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter A First Number => ");
		No1 = s.nextInt();
		
		System.out.println("Enter A Second Number => ");
		No2 = s.nextInt();

		int Mul = No1 * No2;

		System.out.println("Multiplication Of " + No1 + " * " + No2 + " = "+ Mul);

	}
	public static void main(String [] args)
	{
		Multiplication obj = new Multiplication();
		obj.Mul();
	}
}