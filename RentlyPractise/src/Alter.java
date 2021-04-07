import java.util.*;
public class Alter {
	public static void main(String arh[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i+=2) {
			System.out.print(str.charAt(i));
		}
	}

}
