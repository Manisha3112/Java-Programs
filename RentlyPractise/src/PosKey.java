import java.util.*;
  
public class PosKey {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		  }
		  int k=sc.nextInt();
		  int flag=0;
		  for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				System.out.println(i+1);
				flag=1;
			}
		  }
		  if(flag==0){
			System.out.println("Not present");
		  }

	     }

     

}
