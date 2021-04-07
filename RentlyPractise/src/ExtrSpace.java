import java.util.*;
public class ExtrSpace {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String iArr[]=str.split("  ");
		for(int b=0;b<iArr.length;b++)
		{
			System.out.print(iArr[b]);
		}
	}

}
