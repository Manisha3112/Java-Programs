//Hel*lo
import java.util.*;
public class Hel {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ans='\0';
		for(int i=0;i<str.length()-1;i++)
		{
			System.out.print(str.charAt(i));
			if(str.charAt(i)==str.charAt(i+1))
			{
				System.out.print("*");
			}
		}
		ans=str.charAt(str.length()-1);
		System.out.println(ans);
	}

}
