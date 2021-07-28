package mypack;

public class Securenotsecure {
	public static String issecure(String str) {
		if(str.startsWith("https://")) {
			return "secure";
			
		}
		else {
			return "not secure";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(issecure("https://en.wikipedia.org/wiki/Main_page"));
		System.out.println(issecure("http://en.wikipedia.org/wiki/Main_page"));
		
		
		// TODO Auto-generated method stub

	}

}


