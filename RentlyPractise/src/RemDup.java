import java.util.*;

public class RemDup {
	
	    public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      TreeSet<Integer> myset=new TreeSet<Integer>();
	      for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
		   myset.add((arr[i]));
	      }
	      System.out.println(myset);

	    }

     
}
