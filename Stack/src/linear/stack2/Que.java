package linear.stack2;

public class Que {
	Static int size=4;
	Static int qu[]= new int[size];
	Static int front=0,rear=0;
	
	public static boolean isFull() {
		if(size==rear)
			return true;
		else
			return false;
		
	}
	public static boolean isEmpty() {
		if(size==rear)
			return true;
		else
			return false;
		
	}

}
