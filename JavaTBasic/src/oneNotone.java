import java.util.*;
public class oneNotone {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int c=0;
		int v=0;
		for(int i=0;i<str.length()-1;i++)
		{
		int n=Integer.parseInt(String.valueOf(str.charAt(i)));
		if(n==1)
			c++;
		else if(n==0)
			v++;
		}
		if(c>0 && v>0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
