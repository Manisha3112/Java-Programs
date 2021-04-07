package cdc;
import java.util.*;
public class NewMark {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	int iSize=sc.nextInt();
	int iAr[]=new int[iSize];
	for(int i=0;i<iAr.length;i++)
	
		iAr[i]=sc.nextInt();
		Arrays.sort(iAr);
	
System.out.println(iAr[0]);
System.out.println(iAr[1]);
System.out.println(iAr[2]);
System.out.println(iAr[iSize-2]);
	}

}
