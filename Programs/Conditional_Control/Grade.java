public class Grade
{
	public static void main(String args[])
	{

		int Marks = 80;
		System.out.println("\n\t Marks = " +Marks);
    		if(Marks >= 90)
    		{
        		System.out.println("\n\tGrade = ' A+'");
    		}
		else if(Marks >= 70)
		{
			System.out.println("\n\t Grade = 'A'");
		}
		else if(Marks >= 60)
		{
			System.out.println("\n\t Grade = 'B'");
		}
		else if(Marks >= 50)
		{
			System.out.println("\n\t Grade = 'C'");
		}
		else if(Marks >= 35)
		{
			System.out.println("\n\t Grade = 'D'");
		}
		else if(Marks >= -35)
		{
			System.out.println("Fail");
		}
   		
	}

}