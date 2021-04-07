import java.util.*;
public class SumPri {
	public static  void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int iR=sc.nextInt();
		int iC=sc.nextInt();
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
				if(i==j)
				{
					iS+=iAr[i][j];
				}
			}
	}
		System.out.println(iS);
	}

}
