public class Using_This
{
	int a = 20, b = 30;
	public void div(int a,int b)
	{
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public static void main(String[] args)
	{
		 Using_This obj = new Using_This();
		 obj.div(60,90);
	}
}