import java.util.*;
public class SumDig {
 public static void main(String ar[])
 {
	 Scanner sc=new Scanner(System.in);
	 int iT=sc.nextInt();
	 int rem=0;
	 
	 for(int i=0;i<iT;i++)
	 {
		 int c=sc.nextInt();
		 int iNum=sc.nextInt();
		 int iN=iNum;
		 int sum=0;
		 for(int j=0;j<c;j++)
		 {
			 
			 while(iN>0)
			 {
				 rem=iN%10;
				 sum+=rem;
				 iN/=10;
			 }
		 }
			 System.out.println(sum);
		  
	 }
 }
}
