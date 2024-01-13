import java.util.Scanner;

public class Alphabet_Or_Not {
	
	public static void main(String[] args) {
		
	 char ch = '\0';
	 
	 Scanner obj = new Scanner(System.in);
	 
	 System.out.println("Enter A Chracter = > ");
	 char c = obj.next().charAt(0);
	 
	 if(ch >= 'A' || ch <= 'Z' || ch >= 'a' || ch <= 'z' )
	 {
		 System.out.println("Given Character Is Alphabet");
	 }
	 else
	 {
		 System.out.println("Given Character Is Not Alphabet"); 
	 }
	 
		
	}
}
