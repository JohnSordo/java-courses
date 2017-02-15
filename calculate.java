public class calculate 
{
	public static void main(String[] arg)
	{
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		
		float third = Float.valueOf(arg[2]);
		float fourth = Float.valueOf(arg[3]);
		float summ2 = third / fourth;
		System.out.println("First sum " + summ);
		System.out.println("Second " + summ2);
	}
}