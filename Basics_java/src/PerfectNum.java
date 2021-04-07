import java.util.Scanner;
public class PerfectNum {
	  public static void main(String ar[])
		{
			Scanner sc=new Scanner(System.in);
			int iN=sc.nextInt();
			int iS=0;
			for(int i=1;i<iN;i++)
			{
					if(iN%i==0)
						iS+=i;
				
			}
			if(iS==iN)
				System.out.println("perfect number");
			else
				System.out.println("Not a perfect number");
			
		

	}
}
