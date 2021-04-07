import java.util.*;
public class RevNum {
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int iN=sc.nextInt();
		int temp=0;
		while(iN>0)
		{
			int rem=iN%10;
			temp=(temp*10)+rem;
			iN/=10;
		}
		System.out.println(temp);
	}

}
