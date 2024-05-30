class Convert
{
	public static void main(String argv[])
	{
		double c=Double.parseDouble(argv[0]);
		double f=Double.parseDouble(argv[1]);
		System.out.println("in f is:"+((c*1.8)+32));
		System.out.println("in c is:"+(0.55*(f-32)));
	}
}