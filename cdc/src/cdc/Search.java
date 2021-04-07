package cdc;
import java.util.*;
public class Search {

	    ArrayList A1=new ArrayList();
	    ArrayList A2=new ArrayList();
	    public ArrayList saveEvenNumbers(int N)
	    {
	        for(int i=2;i<=N;i++)
	        {
	            if(i%2==0)
	            {
	                A1.add(i);
	            }
	        }
	        return A1;
	    }
	     public ArrayList doubleEvenNumbers(int N)
	    {
	        Iterator itr=A1.iterator();
	        while(itr.hasNext())
	        {
	            int a=(int)itr.next();
	            A2.add(a*2);
	        }
	        
	        return A2;
	    }
	   
	    public int checkNumber(int N)
	    {
	        Iterator itr=A1.iterator();
	        int res=0;
	         while(itr.hasNext())
	         {
	            int a=(int)itr.next();
	            if(N==a)
	            return a;
	            
	        }
	        
	        return res;
	    }
		public static void main(String[] args) {
		Main obj=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int N=sc.nextInt();
		System.out.println("Even numbers: "+obj.saveEvenNumbers(N));
	System.out.println("Even numbers multiplied by 2: "+obj.doubleEvenNumbers(N));
	System.out.println("enter search number");
	int search=sc.nextInt();
	System.out.println(obj.checkNumber(search));
		
		}
	}

}
