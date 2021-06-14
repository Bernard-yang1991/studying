
public class LoopArray {

	
	public static void main(String[] args)	{
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhyuck";
		users[2] = "youbin";
		
		/*
		 * <li>egoing</li>
		 * <li>jinhyck</li>
		 * <li>youbin</li>
		 */
		
		for(int i=0; i<users.length; i++)	{
			System.out.println(users[i] +",");
		}
	}
}
