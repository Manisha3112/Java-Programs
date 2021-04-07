import java.util.*;
public class JoiningAr {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.next();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			temp+=str.charAt(i);
		}
		for(int i=0;i<str2.length();i++)
		{
			temp+=str2.charAt(i);
		}
		System.out.print(temp);
	}

}
