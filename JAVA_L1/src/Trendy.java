import java.util.*;
public class Trendy {
	public static void main(String ag[])
	{
		Scanner sc=new Scanner(System.in);
		int quo;
	
		
		int iT=sc.nextInt();
		for(int g=0;g<iT;g++)
		{
			int iN=sc.nextInt();
			int b=iN;
			int c=0;
			while(iN>0)
			{
				iN=iN/10;//
				c++;
			}
			if(c==3)
			{
				b=b%10;
				b=b/10;//
			if(b%3==0)
			
				System.out.println("Trendy Number");
			
			else
			
				System.out.println(" Not a Trendy Number");
			}
			
			else
				
				System.out.println(" Not a Trendy Number");
			
		}
		
	}
	
}
