
public class WhiyMethod {

		public static void main(String[] args)	{
					
								//����, argument
			//100000000
			printTwoTimesA("a", "-");
			//100000000
			printTwoTimesA("a", "*");
			//100000000
			printTwoTimesA("a",	"&");
			printTwoTimesA("b", "!");
		}
		
											//�Ű�����, parameter
		public static void printTwoTimesA(String text, String delimiter) 	{
			System.out.println(delimiter);
			System.out.println(text);
			System.out.println(text);
		}
}
