public class SwitchCaseSec
{
	public static void main(String args[])
	{
		String Day = "Monday";

		switch(Day)
		{	
			case "Sunday" :
				System.out.println("Iadali");
				break;

			case "Monday":
				System.out.println("Dosa");
				break;

			case "Tuesday" :
				System.out.println("Uttapa");
				break;

			case "Wednesday" :	
				System.out.println("PavBhaji");
				break;

			case "Thursday" :
				System.out.println("AApe");	
				break;

			case "Friday" :
				System.out.println("Poha");
				break;

			case "Saturday" :
				System.out.println("Shira");
				break;

			default:
				System.out.println("Please Enter Week Days !!");
				break;
		}
	}

}