import java.util.*;
public class CountAl{
	public static void main(String faf[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();

		int n=s.length();
		for(int i=0;i<n;i++)
		{
			int c=1;
			while(i<n-1 && s.charAt(i)==s.charAt(i+1))
			{
				c++;
				i++;
			}
			System.out.println(s.charAt(i));
			System.out.println(c);
		}
	}
}