import java.util.*;
public class ArwoInterval {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int fi=sc.nextInt();
		int la=sc.nextInt();
	
		int c=0;
		int rem=0;
		int sum=0;
	
		for(int i=fi;i<la;++i)
		{
			int iN=i;
			while(iN>0) {
			c=iN%10;//153=3
			sum+=c*c*c;
			iN=iN/10;
			
			}
			
		
		if(sum==i)
		System.out.println(i);
		}	
		
	}

}
