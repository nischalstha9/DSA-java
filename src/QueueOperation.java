public class QueueOperation {
	
	int size, front,rear, queue[];
	
	void createQueue(int size) {
		this.size = size; //we are assigning size defined by user to size variable of class.
		this.queue = new int[size]; //create an array of size defined by user
		this.front = 0;
		this.rear = -1;
	}
	
	boolean isEmpty() {
		return this.rear + 1 == this.front;
	}
	
	boolean isFull() {
		return this.rear == size-1;
	}
	
	void makeEmpty() {
		this.front = 0;
		this.rear = -1;
		for (int i = 0; i < queue.length; i++) {
			this.queue[i] = 0;
			
		}
	}
	
	void Enqueue(int data) {
		if (isFull()) {
			System.out.println("Cannot enqueue! queue Full!!");
		}else {
			this.rear += 1;
			this.queue[rear] = data;
			System.out.println(" inserted to queue");
		}
	}
	
	void Dequeue() {
		if (isEmpty()) {
			System.out.println("Cannot dequeue! queue Empty!!");
		}else {
			this.queue[front] = 0;
			this.front += 1;
			System.out.println(" removed from queue");
		}
	}
	
	void Traverse() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println(queue[i]);
		}
	}
	
	public static void main(String[] args) {
		QueueOperation QT = new QueueOperation();
		String Emsg;//empty message		
		String Fmsg;// full message
		
		QT.createQueue(5);
		
		int i;
		for(i=0; i<2; i++) {
			QT.Enqueue(1);
		}
		QT.Traverse();
		Emsg = QT.isEmpty()?"Queue Empty":"Queue Not Empty";
		Fmsg = QT.isFull()?"Queue Full":"Queue Not Full";
		System.out.println(Emsg);
		System.out.println(Fmsg);
		
//		for(i=0; i<2; i++) {
//			QT.Dequeue();
//		}
		QT.makeEmpty();
		
		QT.Traverse();
		Emsg = QT.isEmpty()?"Queue Empty":"Queue Not Empty";
		Fmsg = QT.isFull()?"Queue Full":"Queue Not Full";
		System.out.println(Emsg);
		System.out.println(Fmsg);
	}


}
