import java.util.Scanner;
public class Addition
{
	public void Add()
	{
		int No1;
		int No2;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter A First Number => ");
		No1 = s.nextInt();
		
		System.out.println("Enter A Second Number => ");
		No2 = s.nextInt();

		int Add = No1 + No2;

		System.out.println("Addition Of " + No1 + " + " + No2 + " = "+Add);

	}
	public static void main(String [] args)
	{
		Addition obj = new Addition();
		obj.Add();
	}
}