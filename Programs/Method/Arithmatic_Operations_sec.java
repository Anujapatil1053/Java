public class Arithmatic_Operations_Sec
{
	int a = 10;
	int b = 20;

	public int Add()
	{
		int Add = a + b;
		return Add;
	}
	public  int Mul()
	{
		Arithmatic_Operations_Sec a = new Arithmatic_Operations_Sec();
		int Ans = a.Add();
		int Mul = Ans * 4;
		return Mul;
	}
	public  int  Div()
	{
		Arithmatic_Operations_Sec a = new Arithmatic_Operations_Sec();
		int Ans = a.Mul();
		int Div = Ans / 6;
		return Div;
	}
	public static void main(String [] args)
	{
		Arithmatic_Operations_Sec a = new  Arithmatic_Operations_Sec();
		System.out.println(a.Add());
		System.out.println(a.Mul());
		System.out.println(a.Div());	
	}
}