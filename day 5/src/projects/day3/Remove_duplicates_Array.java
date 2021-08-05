package projects.day3;
import java.util.Arrays;

public class Remove_duplicates_Array {

	public static void main(String[] args) {
		int arr[]= {2,2,32,33,22,4,22,22,37,37};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		removeDuplicates(arr);
		

	}
	static void removeDuplicates(int arr[])
	{
				int n= arr.length;
		if(n==0||n==1)
		{
			System.out.println(Arrays.toString(arr));
		}
		else
		{
			int j=0;
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]!=arr[i+1])
				{
				  arr[j++]=arr[i];
				}
			}
			arr[j++]=arr[n-1];
			for(int i=0;i<j;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
