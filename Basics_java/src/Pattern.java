import java.util.*;
public class Pattern {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		for(int i=0;i<iN;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
