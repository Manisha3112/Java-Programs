import java.util.Scanner;

public class SumAll {
	public static void main(String at[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int iS=0;
		for(int i=0;i<str.length();i++) {
		
			iS+=str.charAt(i);
		
		}
		System.out.println(iS);
		
	}
	

}
