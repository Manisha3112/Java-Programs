import java.util.Scanner;

public class IdenMa {
	public static void main(String ah[])
	{
		Scanner sc=new Scanner(System.in);
		int iR=sc.nextInt();
		int iC=sc.nextInt();
		int flag=1;
		int iAr[][]=new int[iR][iC];
		int val=0;
		int c=0;
		int iS=0;
		int iM=iR*iC;
		
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				 iAr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				if(iAr[i][j]==1)
				{
				   c++;
				}
				else if(iAr[i][j]==0)
				 val++;
			}
	
		}
	
		if(c==iR && val==iM-iR)
			System.out.println("Matrix Identical");
		else
			System.out.println("Not Identical");
		
	}
	

}



