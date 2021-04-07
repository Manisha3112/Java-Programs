import java.util.*;
public class Elevenpattern {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int iT=sc.nextInt();
	for(int g=0;g<iT;g++)
	{
		int iN=sc.nextInt();
		for(int i=0;i<iN;i++)
		{
			int n=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(n+" ");
				n=n*(i-j)/(j+1);
				
			}
			System.out.println();
		}
	}
}
}
