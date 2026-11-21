
public class StringPali {
	public static void main(String[] args) {
		
		String str = "rati";
		String temp = str;
		
		String rev= " ";
		
		for(int i = str.length();i>0;i--) {
			rev =rev+ str.charAt(i);
			
			
		}
		
		if(rev==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
