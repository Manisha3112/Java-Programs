import java.util.*;
public class Swap {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String sArr[]=str.split(" ");
		for(int i=sArr.length-1;i>=0;i--)
		{
			System.out.print(sArr[i]+" ");
			
		}
	}
	

}
