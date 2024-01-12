public class Arithmatic_Operations
{
	int a = 10;
	int b = 20;
	int Add,Mul,Div;
	public void Add()
	{
		Add = a + b;
		System.out.println("Addition Of "+ a + " + " + b + " = " +Add);
	}
	public void Mul()
	{
		Mul = Add * 4;
		System.out.println("Multiplication Of "+ Add + " *  4 = " +Mul);
	}
	public void Div()
	{
		Div = Mul / 6;
		System.out.println("Division Of "+ Mul + " / 6 = " +Div);
	}
	public static void main(String [] args)
	{
		Arithmatic_Operations a = new  Arithmatic_Operations();
		a.Add();
		a.Mul();
		a.Div();	
	}
}