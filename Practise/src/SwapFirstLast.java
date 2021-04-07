import java.util.*;
public class SwapFirstLast {

	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
	
		for(int a=0;a<arr.length;a++)
		{
		 if(Character.isLowerCase(arr[a].charAt(0)))
		 {
			arr[a]=arr[a].charAt(arr[a].length()-1)+arr[a].substring(1,arr[a].length()-1)+arr[a].charAt(0); 
		 }
		}
		for(String a:arr)
			System.out.print(a+" ");
	}
}
