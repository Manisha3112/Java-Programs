import java.util.*;
public class MaxMinSumArr {
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
	 System.out.println("Min:"+iAr[0]);
	 System.out.println("Max:"+iAr[n-1]);
	 for(int i=0;i<n;i++)
	 {
		 sum+=iAr[i];
	 }
	 System.out.println(sum);
 }
}
