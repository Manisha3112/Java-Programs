import java.util.*;
public class Sumx {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int iN=sc.nextInt();
		int iArr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			iArr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(iArr[i]+iArr[j]==iN)
				{
					System.out.println(iArr[i]+" "+iArr[j]);
				}
			}
		}
	}

}
