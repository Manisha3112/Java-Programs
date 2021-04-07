import java.util.*;
public class Dominator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int value=0;
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
				if(iArr[i]==iArr[j])
				
	             count++;
				
			}
			int b=iSize/2;
			if(count>b)
			{
				value=iArr[i];
				flag=1;
			
			}
		}
		if(flag==1)
		
			System.out.println(value);
		
		else
			System.out.println("-1");
	
}
}

