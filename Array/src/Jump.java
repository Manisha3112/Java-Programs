import java.util.*;
public class Jump {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		int iAr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			iAr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a;i+=2)
		{
			if(iAr[i]!=1)
			{
				c++;
				
			}
		}
		System.out.println(c+" ");
		
		
	}

}
