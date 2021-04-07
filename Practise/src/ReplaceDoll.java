import java.util.*;
public class ReplaceDoll {
	public static void main(String sf[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		String sp[]=str.split(" ");
		String temp=" ";
		for(int i=0;i<sp.length;i++)
		{
			temp=sp[0];
		}
		System.out.println(temp);
		for(int j=1;j<sp.length;j++)
		{
		   System.out.print(sp[j].replace(ch,'$')+" ");	
			}
		
	}

}
