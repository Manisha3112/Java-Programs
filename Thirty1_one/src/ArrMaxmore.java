import java.util.Arrays;
import java.util.Scanner;

public class ArrMaxmore {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int si=sc.nextInt();
		int iA[]=new int[si];
		int iC=0;
		for(int i=0;i<si;i++)
		{
			iA[i]=sc.nextInt();
		}
		for(int i=0;i<si;i++)
		{
			iC+=Math.log10(iA[i])+1;
		}
		int iB[]=new int[iC];
		int j=0; 
		for(int i=0;i<si;i++)
		{
			while(iA[i]>0 && j<iC)
			{
				iB[j]=iA[i]%10;
				iA[i]=iA[i]/10;
				j++;
			}
		}
		Arrays.sort(iB);
		for(int i=0;i<iC;i++)
		{
			System.out.print(iB[i]);
		}
		
		System.out.println();
		for(int i=iC-1;i>=0;i--)
		{
			System.out.print(iB[i]);
		}
		
		}
	


}
