public class PellNumSec
{
	public static void main(String args[])
	{
		int No1 = 0,No2 = 1,No3 = 0,Cnt = 7,P_No1= 0,P_No2 = 1,P_No3 = 0;

		System.out.println(No1);
		System.out.println(No2);
    		while(Cnt > 0)
    		{
       			
        		P_No3 = P_No1 + (P_No2*2);
			No3 = No1 + No2;
			System.out.println(No3+P_No3);
       		 	P_No1 = P_No2;
        		P_No2 = P_No3;

       		 	No1 = No2;
        		No2 = No3;
        		Cnt--;
    		}
	}
}

