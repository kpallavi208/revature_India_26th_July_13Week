package projects.day3;

public class Prime_no_Array {

	public static void main(String[] args) {
		int arr[]= {2,29,7,17,100,5};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}
		

	}
	static boolean isPrime(int a)
	{
		boolean b=true;
		if(a==2)
		{
			b=true;
		}
		else
		{
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		}
		return b;
		// TODO Auto-generated method stub

	}

}
