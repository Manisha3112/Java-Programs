import java.util.*;
public class CapsFirst {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sAr[]=s1.split(" ");
		for(String b:sAr)
		{
			String s2=b.toUpperCase();
			System.out.print(s2.charAt(0)+b.substring(1)+" ");
		}
	}

}
