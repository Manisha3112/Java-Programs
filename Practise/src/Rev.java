import java.util.*;
public class Rev {
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	}

}
