public class Arithmatic_Operation
{
	public void div(int a,int b)
	{
		int div = b / a;
		System.out.println(div);
	}
	public static void main(String[] args)
	{
		Arithmatic_Operation obj = new Arithmatic_Operation();
		obj.div(10,20);
	}
}