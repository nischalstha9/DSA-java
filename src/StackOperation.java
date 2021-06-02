
public class StackOperation {
	
	int size, top, stack[];
	
	void createStack(int size) {
		this.size = size; //we are assigning size defined by user to size variable of class.
		this.stack = new int[size]; //create an array of size defined by user
		this.top = -1;
	}
	
	boolean isEmpty() {
		return this.top < 0;
	}
	
	boolean isFull() {
		return this.top >= this.size - 1;
	}
	
	void pushToStack(int data) {
		if (isFull()) {
			System.out.println("Cannot insert! Stack Full!!");
		}else {
			this.top += 1;
			this.stack[top] = data;
			System.out.println(" inserted to stack");
		}
	}
	
	void popFromStack() {
		if (isEmpty()) {
			System.out.println("Cannot pop data! Stack Empty!!");
		}else {
			this.stack[top] = 0;
			this.top -= 1;
			System.out.println(" removed from stack");
		}
	}
	
	 void displayStackItems(){
	        for(int i=0;i<=top;i++){
	            System.out.println(stack[i]);
	        }
	    }
	    
	
	public static void main(String[] args) {
		StackOperation ST = new StackOperation();
		ST.createStack(10);
		ST.pushToStack(1);
		ST.pushToStack(2);
		ST.pushToStack(3);
		ST.pushToStack(1);
		ST.pushToStack(2);
		ST.pushToStack(3);
		ST.pushToStack(1);
		ST.pushToStack(2);
		ST.pushToStack(3);
		ST.pushToStack(1);
		ST.pushToStack(1);
		ST.displayStackItems();
		if(ST.isEmpty())
			System.out.println("stack Empty");
		else
			System.out.println("Stack not empty");
		if(ST.isFull())
			System.out.println("stack Full");
		else
			System.out.println("Stack not full");
		int i;
		for(i=0; i<11; i++) {
			ST.popFromStack();
		}
		ST.displayStackItems();
		if(ST.isEmpty())
			System.out.println("stack Empty");
		else
			System.out.println("Stack not empty");
		if(ST.isFull())
			System.out.println("stack Full");
		else
			System.out.println("Stack not full");
		
		
		
		
	}

}
