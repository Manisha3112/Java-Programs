import java.util.Scanner;

public class RemDup2 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			String sb=String.valueOf(str.charAt(i));
					if(!s1.contains(sb))
						
					{
				   s1+=sb;
					}
		}
		for(int i=s1.length()-1;i>=0;i--)
		{
		System.out.print(s1.charAt(i));
		}
	}

}


