import java.util.Scanner;
public class Unique{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int value=1;
		int min=Integer.MAX_VALUE;
		int count;
		int iSize=sc.nextInt();
		int flag=0;
		int iArr[]=new int[iSize];
		for(int i=0;i<iSize;i++)
		
			iArr[i]=sc.nextInt();
		
		for(int i=0;i<iSize;i++)
		{
			count=0;
			for(int j=0;j<iSize;j++)
			{
				if(iArr[i]==iArr[j]&&(i!=j))
				
	             count++;
				
			}
			
			if(count==0)
			{
				if(iArr[i]<min)
				{	
				min=iArr[i];
				flag=0;
			
			}
		}
		}
		
	
}
}




