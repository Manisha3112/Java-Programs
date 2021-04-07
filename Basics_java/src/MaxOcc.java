import java.util.*;
public class MaxOcc {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		int si=sc.nextInt();
		int c=0;
		int iAr[]=new int[si];
		for(int i=0;i<si;i++)
		{
			iAr[i]=sc.nextInt();
			
		}
		int x=sc.nextInt();
		for(int i=0;i<si;i++)
		{
			for(int j=i;j<si;j++)
			{
			if(iAr[i]==x)
			{
				c++;
			}
		}
			System.out.print(c);
			
		}
	}
}
