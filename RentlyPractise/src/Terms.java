import java.util.*;
public class Terms
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	{
		int iN=sc.nextInt();
		int pro=1;
		if(iN==1)
		{
			System.out.println("1");
		}
		else
		{
			for(int i=2;i<=iN;i++)
			{
				pro=pro*2;
			}
			System.out.println(pro);
		}
	}
	}
	
}