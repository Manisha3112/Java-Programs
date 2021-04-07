import java.util.*;
public class Prime {
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int max=0;
	System.out.println("the numbers in given range is");
	for(int i=a;i<b;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			
				count++;
		}
			if(count==2)
			
				System.out.println(i);
				max=i;
			
		}
	
  System.out.println("The max"+max);
}	
}

