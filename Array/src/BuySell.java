import java.util.*;
public class BuySell {
	public static void main(String ad[])
	{
		Scanner sc=new Scanner(System.in);
		int max=0;
		int iN=sc.nextInt();
		int iAr[]=new int[iN];
		int diff=0;
		int sell=0;
		int buy=0;
		int pri=0;
		for(int i=0;i<iN;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<iN;i++)
		{
			for(int j=i+1;j<iN;j++)
			{
			diff=iAr[j]-iAr[i];
			if(diff>max)
			{
			max=diff;
			sell=j+1;
			buy=i+1;
			}
		}
		}
//			
			System.out.println("Buying:"+buy +"\n"+"Selling:"+sell);
			}
		
	

}
