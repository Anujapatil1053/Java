public class PrimeSec
{
	public static void main(String args[])
	{
		int No = 0, Cnt = 0; 
		
           	for(No = 2; No <= 100; No++)
		{
			for(Cnt = 2; Cnt <= No; Cnt++)
			{
				if(No % Cnt == 0)
				{
					break;
				}
	       		}
			if(No == Cnt)
			{
				System.out.println("\n\t It Is Prime Number = "+No);
			}
			else
			{
				System.out.println("\n\t It Is Not Prime Number = "+No);
			}
		}
	}
		
}
