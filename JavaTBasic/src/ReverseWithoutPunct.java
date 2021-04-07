import java.util.*;
public class ReverseWithoutPunct {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String sr=sc.nextLine();
		for(int i=sr.length()-1;i>=0;i--)
		{
			System.out.print(sr.charAt(i));
		}
	}

}
