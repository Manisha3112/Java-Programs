import java.util.*;
public class RemS2 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		for(int i=0;i<s2.length();i++)
		{
			s1=s1.replaceAll(Character.toString(s2.charAt(i)),"");
		}
		System.out.print(s1);
	}

}
