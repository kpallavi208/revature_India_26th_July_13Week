package projects.day3;

public class Palindrome {

	public static void main(String[] args) {
		

			
				// TODO Auto-generated method stub
				int arr[]= {1,2,2,33,4554,345543,67,78};
				palindrome(arr);

			}
			 static boolean isPalindrome(String s)
			 {
				 StringBuilder sb= new StringBuilder(s);
				 sb.reverse();
				 String s1=sb.toString();
				 return s1.equals(s);
			 }
			 static void palindrome(int arr[])
			 {
				 for(int i=0;i<arr.length;i++)
				 {
					 
					 if(isPalindrome(arr[i]+""))
					 {
						 System.out.print(arr[i]+" ");
					 }
				 }
			 }

		
		// TODO Auto-generated method stub

	}


