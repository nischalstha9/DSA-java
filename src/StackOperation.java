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
		int i;
		for(i=0; i<11; i++) {
			ST.pushToStack(i);
		}
		ST.displayStackItems();
		String msg = ST.isEmpty()?"stack Empty":"Stack Not Empty";
		System.out.println(msg);
		msg = ST.isEmpty()?"stack Full":"Stack Not Full";
		System.out.println(msg);
		for(i=0; i<11; i++) {
			ST.popFromStack();
		}
		ST.displayStackItems();
		msg = ST.isEmpty()?"stack Empty":"Stack Not Empty";
		System.out.println(msg);
		msg = ST.isEmpty()?"stack Full":"Stack Not Full";
		System.out.println(msg);		
	}

}
