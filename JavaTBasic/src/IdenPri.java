import java.util.*;
public class IdenPri {
	public static void main(String ah[])
	{
		Scanner sc=new Scanner(System.in);
		int iR=sc.nextInt();
		int iC=sc.nextInt();
		int flag=0;
		int iAr[][]=new int[iR][iC];
		int iS=0;
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
				if(iAr[i][j]==iAr[j][i])
				{
				   flag++;
				}
				
			}
	
		}
		if(flag==iR+iC)
			System.out.println("Symmetrical");
		else
			System.out.println(" Not Symmetrical");
		
	}
	

}
