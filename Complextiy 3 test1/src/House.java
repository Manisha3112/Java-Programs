
import java.util.*;
public class House {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	for(int i=0;i<test;i++)
	{
	   int h=sc.nextInt();
	   int m=sc.nextInt();
	   int c=0;
	   if(h%2==0)
	   {
		   for(int j=2;j<=h;j+=2)//5 houses 10money//1+3+5=30
			   //2home 12  oney?//12
			   c++;
	   }
	   else
	   {
	   for(int g=1;g<=h;g+=2)
	   c++;
	   }
	   System.out.println(c*m);
	}

}}
