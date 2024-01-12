public class Parametarized_Method
{
	int a = 20, b = 30;
	public void div(int a,int b)
	{
		int div = b / a;
		System.out.println(div);
		return div;
		
	}
	public static void main(String[] args)
	{
		Parametarized_Method obj = new  Parametarized_Method();
		System.out.println(obj.div(10,20));
	}
}