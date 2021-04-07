
import java.util.*;
public class Swap {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int t=iN;
		int iC=(int)(Math.log10(iN))+1;
		//System.out.println(iC+1);
		int first=(int)(iN/(Math.pow(10, iC-1)));
		int sec=(int)(iN/(Math.pow(10,iC-2)));
		sec%=10;
		System.out.println(sec);
		int exceptfirst=(int)(iN%Math.pow(10,iC-1));
		exceptfirst%=10;
		System.out.println(exceptfirst);
		int last=iN%100;
		int seclas=last/10;
		System.out.println(seclas);
		System.out.println(first+" "+seclas);
		int ans=(int)(seclas*Math.pow(10, iC-1))+(exceptfirst/10000)*10+sec;
		System.out.print(ans);
		
	}

}
