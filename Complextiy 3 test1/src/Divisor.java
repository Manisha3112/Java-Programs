import java.util.*;
public class Divisor {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3="";
		if(s1.length()<=s2.length())
		{
			while(s3.length()<s2.length())
			{
				s3+=s1;
			}
			if(s3.equals(s2))
				System.out.println("divisor");
			else
				System.out.println("Not a divisor");
		}
		else
			System.out.println("Not a divisor");
			
	}

}
