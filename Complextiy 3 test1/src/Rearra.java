import java.util.*;
public class Rearra {
	public static void main(String sd[])
	
	{
		Scanner sc=new Scanner(System.in);
	    int iT=sc.nextInt();
	    int iAr[]=new int[iT];
	    for(int i=0;i<iT;i++)
          {
	    	iAr[i]=sc.nextInt();
	    	
	    	}
	    Arrays.sort(iAr);
	    for(int i=0;i<iT;i++)
        {
	    if(i%2==0)
	    {
	    	System.out.println(iAr[i]);
	    }
        }
	}

}
