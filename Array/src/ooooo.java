import java.util.*;
public class ooooo {
     public static void main(String ar[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 int test=sc.nextInt();
    	 for(int k=0;k<test;k++) {
    	 int a=sc.nextInt();
    	
    	 int max=0;
    	 
    	 	int c=0;
    	 	for(int i=1;i<=a;i++) {
    	 		//System.out.println(i);
    	 	
    	 		if(a%i==0) //if(12%1==0)where c=1
    	 			//12%2==0 where c=2;
    	 			//
    	 			c++; //c=1
    	 	}
    	 
     
     if(c==2) {
    	 System.out.println("prime");
     
     }
     else
     {
System.out.println("no");
   }
     }
}
}

