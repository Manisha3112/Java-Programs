package cdc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int g=s.nextInt();
      for(int i=0;i<g;i++)
      {
    	  int n=s.nextInt();
    	  int num=n;
    	  int sum=0;
    	  while(n>0)
    	  {
    		  int b=n%10;
    		  sum=sum+(b*b*b);
    		  n/=10;
    	  }
    	  if(sum==num)
    		  System.out.println("armstrong number");
    	  else
    		  System.out.println(" not armstrong number");
      }
      
	}

}
