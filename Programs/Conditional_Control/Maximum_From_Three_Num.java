import java.util.Scanner;

public class Maximum_From_Three_Num {

		public static void main(String[] args) {
			
			int No1 = 0,No2 = 0,No3 = 0;
			Scanner obj = new Scanner(System.in);
			
			System.out.println("Enter First Number");
			No1 = obj.nextInt();
			
			System.out.println("Enter Second Number");
			No2 = obj.nextInt();
			
			System.out.println("Enter Third Number");
			No3 = obj.nextInt();
			
			if(No1 > No2 && No1 > No3)
			{
				System.out.println("First Number Maximum" + No1+ " = "+No1 );
			}
			else if(No2 > No1 &&  No2 > No3)
			{
				System.out.println("Second Number Maximum " + No2+ " = "+No2);
			}
			else if(No3 > No2 && No3 > No2)
			{
				System.out.println("Third Number Maximum = >"+No3);
			}
			else
			{
				System.out.println("All Number Are Eqal");
			}
			
			
		}
}
