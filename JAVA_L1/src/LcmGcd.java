import java.util.*;
public class LcmGcd {
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();		
	    for(int i=0;i<iT;i++)
	    {
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	int gcd=1;
	    	for(int j=1;j<=a && j<=b;j++)
	    	{
	    		if(a%j==0 && b%j==0)
	    		gcd=j;
	    	}
	    	int lcm=(a*b)/gcd;
	    	System.out.println(lcm+" "+gcd);
	    }
	}

}
