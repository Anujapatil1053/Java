public class Switch
{
	public static void main(String args[])
	{
		String Grade = "A";

		switch(Grade)
		{	
			case "A+":
				System.out.println("If You Got 90+ Marks");
				break;
			case "A":
				System.out.println("If You Got 90 Better And Good");
				break;
			case "B":
				System.out.println("If You Got 70 Below And 60 Above");
				break;
			case "C":
				System.out.println("If You Got 60 Below And 50 Above");
				break;
			case "D":
				System.out.println("If You Got 50 Below And 35 Above");
				break;
			default:
				System.out.println("Please Enter Correct Input");
				break;
		}
		
	
	}
}
