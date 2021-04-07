import java.util.*;
class Bk{
	String a;
	String b;
	String c;
	String d;
	String e;
	Bk(String a,String b,String c,String d,String e){
	this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
	}
static void bfUp(Bk arr[]) {
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Before updation");
		System.out.println("Brand :"+arr[i].a);
		System.out.println("CC :"+arr[i].b);
		System.out.println("Color :"+arr[i].c);
		System.out.println("fuel type :"+arr[i].d);
		System.out.println("engine type :"+arr[i].e);
	}
}
	static void afUp(Bk arr[])
	{
		arr[1].b="500cc";
		arr[3].c="white";
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("After updation");
			System.out.println("Brand :"+arr[i].a);
			System.out.println("CC :"+arr[i].b);
			System.out.println("Color :"+arr[i].c);
			System.out.println("fuel type :"+arr[i].d);
			System.out.println("engine type :"+arr[i].e);
		}
		
		
	}
}
class Bike {
	public static void main(String args[]) {
		Bk b1=new Bk("pul","1500cc","black","petrl","slvu");
		Bk b2=new Bk("j","1500cc","black","petrl","vu");
		Bk b3=new Bk("g","1500cc","black","petrl","sl");
		Bk b4=new Bk("m","1500cc","black","petrl","su");
		Bk arr[]= {b1,b2,b3,b4};
		Bk.bfUp(arr);
		Bk.afUp(arr);
		
	}

}
