import java.util.*;
public class EvenOdd {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		if((iN&1)==1)
		{
			System.out.println("Odd");
		}
		else
			System.out.println("Even");
	}

}
