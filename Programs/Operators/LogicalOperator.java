public class LogicalOperator
{
	public static void main(String args[])
	{
		

		int No1 = 30,No2 = 80;
		boolean Bool;

		System.out.println("Logical And Statements");
		Bool = ((No1 < No2) && (No1 < No2));
		System.out.println("Given Condition Is " +Bool);
		
		Bool = ((No1 < No2) && (No1 > No2));
		System.out.println("Given Condition Is " +Bool);

		Bool = ((No1 > No2) && (No1 < No2));
		System.out.println("Given Condition Is " +Bool);

		Bool = ((No1 > No2) && (No1 > No2));
		System.out.println("Given Condition Is " +Bool);



		System.out.println("Logical OR Statements");
		Bool = ((No1 < No2) || (No1 > No2));
		System.out.println("Given Condition Is " +Bool);
		
		Bool = ((No1 < No2) || (No1 < No2));
		System.out.println("Given Condition Is " +Bool);

		Bool = ((No1 > No2) || (No1 < No2));
		System.out.println("Given Condition Is " +Bool);

		Bool = ((No1 > No2) || (No1 > No2));
		System.out.println("Given Condition Is " +Bool);
		

	}
}