import java.util.*;
public class Pattern {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		for(int i=1;i<=iN;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
