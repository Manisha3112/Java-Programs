import java.util.*;
public class FreqOccu {
	public static void main(String faf[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
       char ch='\0';
       int max=0;
       int flag=0;
       int a=0;
       int b=0;
		int n=s.length();
		int c=1;
		for(int i=0;i<n;i++)
		{
			
			while(i<n-1 && s.charAt(i)==s.charAt(i+1))
			{
				c++;
				i++;
			}
			System.out.print(s.charAt(i));
			System.out.println(c);
		}
		int[] c=new int[]
		for(int i=0;i<n;i++)
		{
			if(c[i]>c[a])
			{
				b=a;
				a=i;
			}
			else if(c[i]>c[b] && c[i]!= c[a])
				b=i;
	}
	if(flag==1)
		System.out.println(c +"at"+max );
	}
}


