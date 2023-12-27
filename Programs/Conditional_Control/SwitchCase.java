public class SwitchCase
{
	public static void main(String args[])
	{
		String State = "Maharastra";

		switch(State)
		{	
			case "Maharastra":
				System.out.println("\n\tFollowing Are District In Maharashtra");
				System.out.println("\n\tSatara");
				System.out.println("\n\tSangali");
				System.out.println("\n\tKolhapur");
				break;
			case "Odisa":
				System.out.println("\n\tFollowing Are District In Odisa");
				System.out.println("\n\tGanjam");
				System.out.println("\n\tKuttak");
				System.out.println("\n\tBelagavi");
				break;
			case "MadhyaPradesh":
				System.out.println("\n\tFollowing Are District In Madyapradesh");
				System.out.println("\n\tAnuupur");
				System.out.println("\n\tAshoknagar");
				System.out.println("\n\tBarwan");
				break;
			case "Gujrat":
				System.out.println("\n\tFollowing Are District In Gujrat");
				System.out.println("\n\tAmreli");
				System.out.println("\n\tBharuch");	
				System.out.println("\n\tRajkot");
				break;
			case "Bihar":
				System.out.println("\n\tFollowing Are District In Bihar");
				System.out.println("\n\tBanka");
				System.out.println("\n\tKatithar");
				System.out.println("\n\tMadhubani");	
				break;
			case "Panjab":
				System.out.println("\n\tFollowing Are District In Panjab");
				System.out.println("\n\tAmrithsir");
				System.out.println("\n\tBarnala");	
				System.out.println("\n\tbathinda");
				break;
			default:
				System.out.println("Please Enter Correct Input");
				break;
		}
	}

}