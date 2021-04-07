import java.util.*;
public class RotateArr {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int iAr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			iAr[i]=sc.nextInt();
		}
		int iR=sc.nextInt();
		
		for(int i=0;i<iR;i++)
		{
			int temp=iAr[0];
			for(int j=0;j<len-1;j++) {
				
				iAr[j]=iAr[j+1];
				
			}
			iAr[len-1]=temp;
			
		}
		for(int i:iAr)
		{
		System.out.print(i+" ");
		}
	}

}
