
import java.util.*;
public class Abk {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int iA=sc.nextInt();
		int iB=sc.nextInt();
		int iK=sc.nextInt();
		int count=0;
		for(int i=iA;i<=iB;i++)
		{
			if(i%iK==0)
				count++;
		}
		System.out.println(count);
	}

}
