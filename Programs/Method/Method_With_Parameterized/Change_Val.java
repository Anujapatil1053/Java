public class Change_Val
{
	int a = 20, b = 30;

	public void ChangeValue()
	{
		a = 1;
		b = 4;
		
	}
	public void Add()
	{
		int Add = a + b;
		System.out.println(Add);
		
	}
	public static void main(String[] args)
	{
		 Change_Val obj = new Change_Val();
		 obj.Add();
		 obj.ChangeValue();
		 obj.Add();

		 Change_Val obj2 = new Change_Val();
		 obj2.Add();
	
	}
}