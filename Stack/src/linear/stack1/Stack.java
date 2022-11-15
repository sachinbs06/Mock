package linear.stack1;

public class Stack {
	int size,top=-1;
	String stack[];
	
	Stack(int size){
		this.size=size;
		stack = new String[size];
	}
	

	public boolean isFull() {
		if(top==size-1) 
			return true;
		else
			return false;

	}

	public  boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}

	public void push(String ele) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			top++;
			stack[top]=ele;
		}
	}

	public int pop() 
	{
		if(isEmpty()) {
			return -1;
		}
		else {
			int ele=Integer.parseInt(stack[top]);
			top--;
			return ele;
		}
	}
	public void display() {
	
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]+"");
			}
			
			
		}
		
	}
	public  void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.print(stack[top]);
		}
	}
}