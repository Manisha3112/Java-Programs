import java.util.*;
public class AppendString {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans="";
		String sAr[]=str.split(" ");
		for(int i=2;i<sAr.length;i++)
		{
			ans+=sAr[i];
			ans+=" ";
			
		}
		for(int i=0;i<2;i++)
		{
			ans+=sAr[i];
			ans+=" ";
			
		}
		System.out.println(ans+" ");
	}

}
