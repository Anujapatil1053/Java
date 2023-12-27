public class Nested_If_Else
{
	public static void main(String args[])
	{

		int Age = 40;
		
    		if(Age >= 18)
    		{
        		System.out.println("You Are Eligible For Vote");

			if(Age >= 25)
			{	
				System.out.println("You Are Eligible For Vidhansabha");
			}
			if(Age >= 35)
			{	
				System.out.println("You Are Eligible For Vidhansparishad");
			}
			if(Age >= 40)
			{	
				System.out.println("You Are Eligible For CM");
			}
			if(Age >= 45)
			{	
				System.out.println("You Are Eligible For PM");
			}
			if(Age >= 50)
			{	
				System.out.println("You Are Eligible For President");
			}
    		}
		else
		{
			System.out.println("You Are Not Eligible");
		}
   		
	}

}