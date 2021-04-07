import java.util.*;
public class RemDup {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			String sb=String.valueOf(str.charAt(i));
					if(!s1.contains(sb))
						
					{
				   s1+=sb;
					}
		}
		System.out.print(s1);
		}
	

}
