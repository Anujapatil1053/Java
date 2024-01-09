public class Fibonnaci
{
	public static void main(String args[])
	{
		int No1 = 1,No2 = 0,No3 = 0,Cnt = 7;

    		while(Cnt > 0)
    		{
       			System.out.println(No3);
        		No3 = No1 + No2;
       		 	No1 = No2;
        		No2 = No3;
        		Cnt--;
    		}
		
	}
}
