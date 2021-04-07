import java.util.*;
class Book{
	String name;
	String id;
	Book(String s1,String s2){
	name=s1;
	id=s2;
	}
}
class Note {
	public static void main(String ar[]) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		Book[] arr=new Book[a];
		for(int i=0;i<a;i++)
		{
			String s1=sc.next();
			String s2=sc.next();
			arr[i]=new Book(s1,s2);
		}
		String s3=sc.next();
		//System.out.println(s3);
		for(int i=0;i<arr.length;i++)
		{
			if(s3.equalsIgnoreCase(arr[i].name)) {
				System.out.println("Input String "+arr[i].name);
				System.out.println(arr[i].id);
            }
			
		}
	}

}
