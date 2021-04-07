import java.util.*;
public class Divisor {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		for(int i=2;i<=iN;i++)
		{
				if(iN%i==0)
					System.out.println(i);
			}
		}
	

}
