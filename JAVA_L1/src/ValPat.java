import java.util.Scanner;

public class ValPat {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();
		for(int g=0;g<iT;g++)
		{
			int iN=sc.nextInt();
			int n=1;
			for(int i=1;i<=iN;i++)
			{
				
				for(int j=1;j<=i;j++)
				{
					System.out.print(n+" ");
					n++;
					
				}
				System.out.println();
			}
		}
	}
	

}
