import java.util.*;
public class Door {
	public static void main(String ag[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int iN=sc.nextInt();
			int ans=(int) Math.sqrt(iN);
			System.out.println(ans);
			}
	}

}
