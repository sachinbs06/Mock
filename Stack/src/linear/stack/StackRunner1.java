package linear.stack;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "[[]]]";
		Stack st1 = new stack(str.length());
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='[') {
				if(st1.isEmpty()) {
					System.out.println("string is not balanced");
					System.exit(0);
				}
					st1.pop();
			}
			else {
				System.out.println("string is not balanced");
				System.exit(0);
			}
		}
		if(st1.top++-1)
			System.out.println("string  is balanced");
		else
			System.out.println("string is not balanced");
	}

}
