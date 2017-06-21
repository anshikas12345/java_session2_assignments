import java.util.Scanner;
public class HighestNumber
{
	public static void main(String []s)
	{
		int first,second,third;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter first Number");
		first=in.nextInt();
		System.out.println("Enter second Number");
		second=in.nextInt();
		System.out.println("Enter second Number");
		third=in.nextInt();
		
		if((first > second) && (first > third))
		{
			System.out.println("Highest value is "+first);
		}
		else if((second > first) && (second > third))
		{
			System.out.println("Highest value is "+second);
		}
		else if ((third > first) && (third > second))
		{
			System.out.println("Highest value is "+third);
		}
		
	}
}