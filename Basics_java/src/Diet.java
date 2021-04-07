import java.util.*;
public class Diet {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String sp[]=s1.split(" ");
		int a=0;
		int sum=0;
		String sl[]=s2.split("|");
		//System.out.println(Arrays.toString(sp));
		for(int j=0;j<s1.length();j++)
		{
			sum=Integer.parseInt(String.valueOf(s1.charAt(j)));
		}
		for(int i=0;i<s1.length();i++)
		{
		if(Character.isLetter(s1.charAt(i)))
		a++;
		}
		System.out.println(a);
	}

}
