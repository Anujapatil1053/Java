public class Swapping_Without_Third_Number
{
	public static void main(String args[])
	{
		int No1 = 10, No2 = 20;

		No1 = No1 + No2;
		No2 = No1 - No2;
		No1 = No1 - No2;
		
		System.out.println("Before Swapping = "+No1);
		System.out.println("After Swapping = "+No2);
		
		
	}
}