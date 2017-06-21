public class PatternClass
{
	
	public static void main(String []s)
	{
		int iter1,iter2,iter3,iter4=0;
		int no_of_lines=5;
		char []alphabet= {'a','b','c','d','e','f'};
		for (iter1=0;iter1<no_of_lines;iter1++)
		{
			for(iter2=0;iter2 <no_of_lines; iter2++)
			{
				System.out.print(" ");
			}
			for(iter3=0;iter3 <no_of_lines;iter3++)
			{
				System.out.print(alphabet[iter3]);
			}
			for(iter4=0;iter4>=0;iter4--)
			{
				System.out.print(alphabet[iter4]);
			}
			System.out.print("\n");
		}
		for(iter1=0;iter1<no_of_lines;iter1++)
		{
			for(iter2=0;iter2<=iter2;iter2++)
			{
				System.out.print(" ");
			}
			for(iter3=0;iter3 < no_of_lines-iter1-2;iter3++)
			{
				System.out.print(alphabet[iter3]);
			}
			for(iter4=no_of_lines-iter1-2;iter4>=0;iter4--)
			{
				System.out.print(alphabet[iter4]);
			}
			System.out.print("\n");
			
		}
	}
}