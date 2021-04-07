import java.util.*;
public class StringEqufooBar {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s2=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				
				if(str.charAt(i)==s2.charAt(j))
				{
					
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
