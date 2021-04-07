import java.util.*;
public class CheckNum {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int temp=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				//temp+=str.charAt(i);
				temp++;
			
			}
		}
		if(temp>0)
		System.out.println("contains Digit");
		else
			System.out.println("No Digit");
}
}

