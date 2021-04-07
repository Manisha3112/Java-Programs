import java.util.*;
public class RevSen {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String words[]=str.split(" ");
		String rev="";
		for(String w:words){
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rev+=sb.toString()+" ";
		}
		System.out.println(rev);
	}

}
