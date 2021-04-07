import java.util.Scanner;

public class Mul {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int m=1;
		int ext=0;
	  while(iN>0)
	  {
		  int rem=iN%10;
		  m=m*rem;
		  iN/=10;
		  
	  }
	  System.out.println(m);
	}
}
