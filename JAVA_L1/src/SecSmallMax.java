import java.util.Arrays;
import java.util.Scanner;

public class SecSmallMax {
	public static void main(String ar[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int iAr[]=new int[n];
		 int sum=0;
		 for(int i=0;i<n;i++)
		 {
			 iAr[i]=sc.nextInt();
		 }
		 Arrays.sort(iAr);
		 System.out.println("Sec Min:"+iAr[1]);
		 System.out.println("Sec Max:"+iAr[n-2]);
		 
	}
}
