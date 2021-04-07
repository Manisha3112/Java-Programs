import java.util.Scanner;
	
public class swasec {
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int iC=(int)Math.log10(iN)+1;
		int iAr[]=new int[iC];
		int j=iC-1;
		while(iN>0 && j>=0)
		{
			iAr[j]=iN%10;
			iN/=10;
			j--;
		}	
		int temp=iAr[1];
		iAr[1]=iAr[iC-2];
		iAr[iC-2]=temp;
		for(int i=0;i<iC;i++)
		{
			System.out.print(iAr[i]+"");
		}
		
	}
	
		


}
