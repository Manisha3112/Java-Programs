import java.util.*;
public class Miss {
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int var=0;
	int iArr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		iArr[i]=sc.nextInt();
		sum+=iArr[i];
	}
	int iNum=((n+1)*(n+2))/2;
	var=iNum-sum;
	System.out.println(var);
}
}
