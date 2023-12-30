public class Palindrom_1to1000
{
	public static void main(String args[])
	{
		int No = 1991, Rem = 0, Rev = 0,Temp = 0;
		Temp = No;
		
			while(Temp > 0)
			{
				Rem = Temp % 10;
				Rev = (Rev*10)RemDig;
        			Temp  = Temp / 10;
			}
			if(Rev == No)
			{
				System.out.println("Given Number Is" + No + " Is Palindrom" );
			}
			else
			{
				System.out.println("Given Number Is" + No + " Is Not Palindrom" );
			}

			
		
		
	}
}
