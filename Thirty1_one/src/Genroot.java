import java.util.*;
public class Genroot {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int sum=0;
		int ext=0;
	  while(iN>0)
	  {
		  int rem=iN%10;
		  sum+=rem;
		  iN/=10;
		  
	  }
	  System.out.println(sum);
	  int iC=(int)(Math.log10(sum))+1;
	  
	 while(sum>0)
	  {
		 if(iC>1)
		  {
		  int rem=sum%10;
		  ext+=rem;
		  sum/=10;
		  }
	  }
	  System.out.println(ext);
	  } 
	

}
