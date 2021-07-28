package mypack;

public class getdomain {
	public static String domain(String str) {
		if(str.startsWith("https://")) {
			str=str.substring(8);
		}
		else if(str.startsWith("http://")) {
			str=str.substring(7);
					
			
		}
			int i=str.indexOf("/");
			str=str.substring(0,i);
			return str;
			
	}
	

	public static void main(String[] args) {
		System.out.println(domain("https://en.wikipedia.org/wiki/Main_page"));
		// TODO Auto-generated method stub
		
		
		
		
	

	}

}
