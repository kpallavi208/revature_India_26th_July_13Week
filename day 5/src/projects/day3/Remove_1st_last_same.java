package projects.day3;

public class Remove_1st_last_same {

	public static void main(String[] args) {
		int arr[]= {101,22,344,699};
		for(int i=0;i<arr.length;i++)
		{
			if(isLastAndFirstDigitSame(arr[i])!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	static boolean isLastAndFirstDigitSame(int a)
	{
		boolean b=false;
		String s=a+"";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=true;
		}
		return b;
		// TODO Auto-generated method stub

	}

}
