import java.util.Scanner;
public class Addition
{
	public void Add()
	{
		int No1;
		int No2;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter First Value => \n");
		No1 = s.nextInt();

		System.out.println("Enter Second Value => \n ");
		No2 = s.nextInt();

		int Add = No1 + No2;

		System.out.println(Add);

	}
	public static void main(String [] args)
	{
		Addition obj = new Addition();
		obj.Add();
	}
}