class Fact{
	void fac(int n) {
	int fac=1;
	for(int i=1;i<=n;i++)
	{
		fac=fac*i;
	}
	System.out.println(fac);
}

	public static void main(String arg[])
	{
		Fact c=new Fact();
		c.fac(5);
	}

}
