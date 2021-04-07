import java.util.*;
public class PrimeNum {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iF=sc.nextInt();
		int iN=sc.nextInt();
		int count=0;
		for(int i=iF;i<=iN;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}
