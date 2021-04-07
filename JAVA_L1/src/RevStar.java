import java.util.Scanner;

public class RevStar {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();
		for(int g=0;g<iT;g++)
		{
			int iN=sc.nextInt();
			int j;
			for(int i=0;i<iN;i++)
			{
	
				for(j=2*(iN-i);j>=0;j--)
				{
				
					System.out.print(" ");
		
					
				}
				for(j=0;j<=i;i++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
	}
	


}
