import java.util.*;
public class fibonacci {
	public static void main(String ar[]) {
		Scanner sc =new Scanner(System.in);
		int iN1=0;
		int iN2=1;
		int iN3;
		int count=sc.nextInt();
		System.out.print(iN1+" "+iN2);
		for(int i=2;i<count;i++)
		{
		iN3=iN1+iN2;
		System.out.print(iN3+" ");
		iN1=iN2;//iN1=1
		iN2=iN3;//iN2=1
		}
	}

}
