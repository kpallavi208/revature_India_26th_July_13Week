package mypack;

public class lastletteruppercase {

	public static void main(String[] args) {
		System.out.println(lastuppercase("whats going on bro"));
		System.out.println(lastuppercase("hello "));
	
		// TODO Auto-generated method stub

	}
	public static String lastuppercase(String s) {
		String arr[]=s.split(" ");
		int i;
		StringBuffer s1=new StringBuffer();
		for(int j=0;j<arr.length;j++) {
			 i=arr[j].length()-1;
			s1.append(arr[j].substring(0,i)).append(Character.toUpperCase(arr[j].charAt(i))).append(" ");
			
		}
		return s1.toString().trim();
		
		
	}

}
