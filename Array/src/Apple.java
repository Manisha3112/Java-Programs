
import java.util.*;

		public class Apple {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	        sc.close();
	        int avg=0,sum=0;
	        for(int i=0;i<n;i++)
	            sum+=a[i];
	        avg=sum/n;
	        int t1=0;
	        for(int i=0;i<n;i++){
	            if(a[i]<avg){
	                int t=avg-a[i];
	                t1+=t;
	                 System.out.println(t);
	              //  a[i]+=t;
	            }
	            else {
	                int t=a[i]-avg;
	                t1+=t;
	                // System.out.println(t);
	              // a[i]-=t;
	            }
	        }
	        System.out.println(t1/2);
	        // System.out.println(Arrays.toString(a));
	    }
	
}
