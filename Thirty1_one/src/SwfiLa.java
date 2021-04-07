import java.util.*;
public class SwfiLa {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int iC=(int)(Math.log10(iN))+1;
		//System.out.println(iC);
		int first=(int)(iN/(Math.pow(10, iC-1)));
		//System.out.println(first);
		int exceptfirst=(int)(iN%Math.pow(10,iC-1));
		int last=iN%10;
		int ans=(int)(last*Math.pow(10, iC-1))+(exceptfirst/10)*10+first;
		System.out.print(ans);
	}

}
