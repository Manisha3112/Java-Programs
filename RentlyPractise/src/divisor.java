import java.util.*;
public class divisor {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int iN=sc.nextInt();
	for(int i=1;i<iN;i++)
	{
		if(iN%i==0)
		{
			System.out.println(i);
		}
	}
	}
}