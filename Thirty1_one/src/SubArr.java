import java.util.*;
public class SubArr {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int si=sc.nextInt();
		int iAr[]=new int[si];
		for(int i=0;i<si;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<si-1;i++)
		{
		 
			 System.out.println(iAr[i]+","+iAr[i+1]);
		 }
		for(int j=0;j<si-1;j++)
		{
		 
			 System.out.println(iAr[j]+","+iAr[j+1]+","+iAr[j+2]);
		 }
		
		
	}

}
