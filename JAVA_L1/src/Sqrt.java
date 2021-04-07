import java.util.*;
public class Sqrt {
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();
		for(int g=0;g<iT;g++)
		{
			int iN=sc.nextInt();
			int b=iN;
			 int sqr=(int)Math.sqrt(iN);
		
		if(sqr*sqr==b)
		{
			System.out.println("Square number");
		}
		else
			System.out.println(" Not a Square number");
	}
	}
}
