import java.util.Scanner;
public class HighFre {
		public static void main(String arf[])
		{
			Scanner sc=new Scanner(System.in);
			int min=0;
			int count=0;
			int val=1;
			int a=sc.nextInt();
			int iArr[]=new int[50];
			for(int i=0;i<a;i++)
			{
				iArr[i]=sc.nextInt();
			}
			for(int i=0;i<a;i++)
			{
				count=0;
			for(int j=0;j<a;j++)
			{
				if((iArr[i]==iArr[j]))
				{
					count++;
				}
			}
				if(count>min)
				
					
					{
						min=iArr[i];
					}
				
					
			}
			
			 System.out.println(min);	
	}
}

