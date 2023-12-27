public class Vote_Eligibility
{
	public static void main(String args[])
	{

		int Age = 21;
		String Nationality = "Indian";
		
		if((Age > 18) && (Nationality == "Indian"))
		{
			System.out.println("You Are Eligible For Voting");
		}
		else
		{
			System.out.println("You Are Not Eligible For Voting");
		}
		
	}
}