public class Armstrong
{
	public static void main(String args[])
	{
		int No = 1991, Dig = 0, DCnt = 0, Temp = 0,Res = 0;
		Temp = No;
		while(Temp > 0)
		{
			Temp= Temp /10; 
			DCnt++;
			
		}
		Temp = No;
		while(Temp > 0)
		{
			Dig = Temp % 10;
			Res = Res+((int)Math.pow(Dig,DCnt));
			Temp = Temp / 10; 
		}
		if(No == Res)
		{
			System.out.println("Given Number Is Armstrong Number ");
		}
		else
		{
			System.out.println("Given Number Is Not Armstrong Number ");
		}
	}
}
