import java.util.*;
public class Strim {
public static void main(String args[]) {
	int sum=0;
	int count=0;
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)>'0'&& s1.charAt(i)<'9')
			count++;
		
	
	sum+=Integer.parseInt(String.valueOf(s1.charAt(i)));
			
}
}}
