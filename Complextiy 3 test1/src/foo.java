import java.util.*;
public class foo {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			if(a%3==0 && a%5==0)
				System.out.println("FooBar");
			else if(a%3==0)
				System.out.println("Foo");
			else if(a%5==0)
				System.out.println("Bar");
			else
				System.out.println("None");
			
		}
	}

}
