public class PrimeNumber
{
	public static void main(String args[])
	{
		int No = 6, Cnt = 0; 
           
		for(Cnt = 2; Cnt < No; Cnt++)
		{
			if(No % Cnt == 0)
			{
				break;
			}
			}
			if(No == Cnt)
			{
				System.out.println("It IS Prime Number");
			}
			else
			{
				System.out.println("It Is Not Prime Number");
			}
	   }
}
