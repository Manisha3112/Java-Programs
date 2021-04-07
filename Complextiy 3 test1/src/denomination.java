import java.util.*;

public class denomination {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	    int ch[]= {1,5,10,25};
	    for(int i=0;i<t;i++)
	    {
	    	int a=sc.nextInt();
	    	int rem=0,c=0,n=a;
	    	for(int j=3;j>=0;j--)
	    	{
	    		int d=0;
	    		if(n>=ch[j])//72>25
	    		{
	    			d=n/ch[j];//72/25=2//22/10=2//2/1=1
	    			rem=n%ch[j];//22//2
	    			n=rem;//22//2
	    		}
	    		c+=d;
	    	}
	    	System.out.println(c);
	    }
	}
}

