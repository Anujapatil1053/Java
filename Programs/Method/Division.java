public class Division
{
	int a = 10, b=20;
	
	public int div()
	{
		int div = b/a;
		System.out.println(div);
		return div;
	}
	public static void main(String[] args)
	{
		Division obj  = new Division();
		System.out.println(obj.div());
	}
}
