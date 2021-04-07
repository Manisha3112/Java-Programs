import java.util.*;
public class Longword {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1=" ";
		int flag=0;
		String sAr[]=str.split(" ");
		for(String b:sAr)
		{
		if(b.length()>flag)
		{
			s1=b;
		}
		}
		System.out.println(s1);
			
		}
	

}
