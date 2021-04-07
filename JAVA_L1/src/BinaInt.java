import java.util.*;
public class BinaInt {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();
		for(int i=0;i<iT;i++)
		{
			int a=sc.nextInt();
			int count=0;
			for(int j=1;j<=a;j++)
			{
				
				String b=Integer.toBinaryString(j);
				for(int k=0;k<b.length();k++)
				{
					if(b.charAt(k)=='1')
						count++;
				}
			}
			System.out.println(count);
		}
	}

}
