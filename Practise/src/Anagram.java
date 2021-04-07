import java.util.*;
public class Anagram {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		boolean flag=true;
		if(s1.length()!=s2.length())
		{
			flag=false;
		}
		char []sA1=s1.toLowerCase().toCharArray();
		char []sA2=s2.toLowerCase().toCharArray();
		Arrays.sort(sA1);
		Arrays.sort(sA2);
		flag=Arrays.equals(sA1,sA2);
		if(flag)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println(" Not Anagram");
		}
	}

	
}

