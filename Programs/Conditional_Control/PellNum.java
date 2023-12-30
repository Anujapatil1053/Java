public class PellNum
{
	public static void main(String args[])
	{
		int No1 = 0,No2 = 1,No3 = 0,Cnt = 7;

		System.out.println(No1);
		System.out.println(No2);
    		while(Cnt > 0)
    		{
       			
        		No3 = No1 + (No2*2);
			System.out.println(No3);
       		 	No1 = No2;
        		No2 = No3;
        		Cnt--;
    		}
		
	}
}

