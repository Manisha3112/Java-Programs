import java.util.*;
public class Sum_replace {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int iAr[]=new int[iN];
		int sum=0;
		for(int i=0;i<iN;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<iN;i++)
		sum+=iAr[i];
		for(int i=0;i<iN;i++)
			iAr[i]=sum-iAr[i];
		for(int i=0;i<iN;i++)
		{
			System.out.println(iAr[i]);
		}
	}

}
