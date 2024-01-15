public class UnaryOperator
{
	public static void main(String args[])
	{
		int a = 23,b;
		b = a--;

		System.out.println("\t PostDecrement");
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("\t PostIncrement");
		a = 23;
		b = a++;

		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);

		a = 23;
		b = ++a;
		System.out.println("\t Preincrement");
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
		
		a = 23;
		b = --a;
		
		System.out.println("\t PosDecrement");
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);	
	}
}
