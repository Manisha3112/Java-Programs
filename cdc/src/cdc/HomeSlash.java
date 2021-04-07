package cdc;
import java.util.*;
public class HomeSlash {
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String res ="";
	
	for(int i=1;i<str.length();i++)
	{
		if(Character.isAlphabetic(str.charAt(i))&&str.charAt(i-1)=='/')
			res+="/";
		else if(Character.isAlphabetic(str.charAt(i-1)))
				res+=str.charAt(i-1);
	}
    if(Character.isAlphabetic(str.charAt(str.length()-1)))
    		res+=str.charAt(str.length()-1);
    System.out.println(res);
			
	}
	

}
