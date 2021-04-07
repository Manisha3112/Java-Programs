import java.util.*;
public class CountVowLo {
	public static void main(String ag[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int vo=0;
		int up=0;
		int lo=0;
		int sp=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vo++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				up++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				lo++;
			}
			else
			{
				sp++;
			}
		}
			System.out.println(vo);
			System.out.println(up);
			System.out.println(lo);
			System.out.println(sp);
			
		}
}
	
