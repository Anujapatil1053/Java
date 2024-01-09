public class DigitCount
{
	public static void main(String args[])
	{
		int No = 6767676, Dig = 0, DCnt = 0, Temp = No;
		
		while(Temp > 0)
		{
			//Dig = Temp % 10;
			
			Temp= Temp /10; 
			DCnt++;
		}
		System.out.println(DCnt);
	}
}
