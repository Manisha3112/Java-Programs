import java.util.*;
public class IndRev {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String iArr[]=str.split(" ");
		String rev="";
		for(String b:iArr)
		{
			StringBuilder s=new StringBuilder(b);
			s.reverse();
			rev+=s.toString()+" ";
		}
		System.out.println(rev);
	}

}
