import java.util.*;
public class MultiplyLarge {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int iSize=sc.nextInt();
			int iArr[]=new int[iSize];
			for(int j=0;j<iSize;j++)
			
				iArr[j]=sc.nextInt();
				Arrays.sort(iArr);
				if(iSize>2)
				{
				int prod=iArr[iSize-1]*iArr[iSize-2];
				System.out.println(prod);
				}
				else
					System.out.println("No pair exists");
			
		}
	}

}
