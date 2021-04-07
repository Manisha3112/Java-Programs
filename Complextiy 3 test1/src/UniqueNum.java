import java.util.*;
public class UniqueNum {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int num=sc.nextInt();
		int n=0,m=0,g=0;
		int sum=0,mul=0;
		int ji=num;
		if(num>=10)
		{
			n=num/10;//19/10=1
			m=num%10;//19%10=9
	        sum=n+m;
	        mul=n*m;
	        g=sum+mul;
	        if(g==ji)
	        {
	        	System.out.println("Special number");
	        }
	        else
	        {
	        	System.out.println("Not a special number");
	        }
		}
		else
			System.out.println("Invalid input");
	}
}
}
