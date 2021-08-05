package projects29july;
import java.util.Scanner;

public class LastLetterUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String fina="";
		for(String x:arr) {
			fina=fina+convertLast(x)+" ";
		}
		System.out.println(fina);

	}
	static String convertLast(String s)
	{
		char a=s.charAt(s.length()-1);
		char n=Character.toUpperCase(a);
		
		return s.substring(0,s.length()-1)+n;
		// TODO Auto-generated method stub

	}

}
