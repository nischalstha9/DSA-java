
public class BubbleSort {
	public static void main (String[] args) {
		int[] data = {12,13,25,23,6,7,8,1,16};
		int temp;
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1;j++) {
				if(data[j]>data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
	for(int i=0; i< data.length; i++) {
		System.out.println(data[i]);
	}
}
}