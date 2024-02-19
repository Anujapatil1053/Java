public class DigRev
{
	public static void main(String args[])
	{
		int No = 1906,Rev = 0,Rem = 0;
		System.out.println("Given Number = "+ No);
		while(No > 0)
		{
			Rem = No % 10;
			Rev = (Rev*10)+Rem;
        		No  = No / 10;
		}
		System.out.println("Reverse Number = "+Rev);
	}
}
