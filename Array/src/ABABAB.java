import java.util.*;
public class ABABAB {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s1="";
		String s2="";
		//	String sAr[]=str.split("");
		if(str.length()>4)
		{
		for(int i=0;i<2;i++)
		{
			s1+=String.valueOf(str.charAt(i));
		}
		for(int i=2;i<4;i++)
		{
			s2+=String.valueOf(str.charAt(i));
		}
		if(s1.equals(s2))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		}
		else
			System.out.println("No");
		
	}

}
