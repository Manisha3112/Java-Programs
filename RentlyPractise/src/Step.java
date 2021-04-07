import java.util.*;
public class Step {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t1=0;
		int t2=1;
		int t3=0;
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		System.out.println(t3);
		

	}
}