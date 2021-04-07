import java.util.*;
public class Sum {
 public static void main(String at[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int iS=0;
	for(int i=0;i<str.length();i++) {
	if(Character.isDigit(str.charAt(i)))
	{
		iS+=Integer.parseInt(String.valueOf(str.charAt(i)));
	}
	}
	System.out.println(iS);
	
}
}
