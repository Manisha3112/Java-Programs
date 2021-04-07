import java.util.*;
public class ChildChoci {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int iAr[]=new int[n];
		int j=0;
		int f=1;
		int order=0;
		for(int i=0;i<n;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(iAr[j]<iAr[j+1])
			{
				order=2;
				System.out.print(f+" ");
				f++;
				
			}
			
			else 
			{
				f=1;
				System.out.println(order);
				order--;
			}
			
		}
		
		System.out.println("1");
		
			
	}

}
