import java.util.*;
public class unique {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int count=0;
		int val=1;
		int a=sc.nextInt();
		int iArr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			iArr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			count=0;
		for(int j=0;j<a;j++)
		{
			if((iArr[i]==iArr[j]) && i!=j)
			{
				count++;
			}
		}
			if(count==0)
			{
				if(iArr[i]<min);
				{
					min=iArr[i];
				    val=0;
				}
			}
				
			}
		if(val==0)
		{
		 System.out.println(min);	
		}
		else
			System.out.println("No");	
		}
	

}
