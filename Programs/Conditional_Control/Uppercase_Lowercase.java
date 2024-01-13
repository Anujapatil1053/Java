public class Uppercase_Lowercase {
	
	public static void main(String[] args) {
		
		char ch = 'G';
		
		if(ch >= 'A' && ch <= 'Z')
		{
			 System.out.println("Given Character Is Uppercase => " +ch);
		}
		else if(ch >= 'a' && ch <= 'z' )
		{
			System.out.println("Given Character Is Lowercase => " +ch);
		}
		else
		{
			System.out.println("Given Character Is Not Uppercase Or Not Lowercase");
		}
	}
}
