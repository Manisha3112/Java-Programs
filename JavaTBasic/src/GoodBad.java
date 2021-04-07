import java.util.*;
public class GoodBad {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int temp=0;
	int vo=0;
	int count=0;
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		vo++;
	}
	else
		count++;
	if(vo>5||count>3)
	{
		temp=1;
	}
	
	}
	if(temp==0)
	{
		System.out.println("Good String");
	}
	else
		System.out.println("Bad String");

	}
}
