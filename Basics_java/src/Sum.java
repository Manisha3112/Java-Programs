import java.util.*;
public class Sum {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int sum=0;
		int rem=0;
		while(iN>0)
		{
			rem=iN%10;
			sum+=rem;
			iN/=10;
		}
		System.out.println(sum);
	}

}
