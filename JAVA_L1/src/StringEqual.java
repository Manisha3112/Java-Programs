import java.util.*;
public class StringEqual {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Equal");
			
		}
		else
		{
			System.out.println("Not Equal");
			
		}
	}

}
