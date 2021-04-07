import java.util.*;
public class Pallindrome {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int temp=iN;
		int rem=0;
		int sum=0;
		while(iN>0)
		{
			rem=iN%10;
			sum=(sum*10)+rem;
			iN=iN/10;
		}
		if(temp==sum)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}
