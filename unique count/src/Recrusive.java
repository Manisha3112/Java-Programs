import java.util.*;

public class Recrusive {
	  static int rec(int n){
	        int t=0;
	        if(n>0)
	            t=n + rec(n-1);
	        return t;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        System.out.print(rec(n));
	        sc.close();
	    }
	

}
