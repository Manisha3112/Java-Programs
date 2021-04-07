import java.util.*;
public class Upcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c=sc.next().charAt(0);
		int first=s1.indexOf(c)+1;
		int Last=s1.lastIndexOf(c)+1;
		if(first!=Last)
		System.out.println(first +" "+Last);
		else
			System.out.println(first );
	}

}
