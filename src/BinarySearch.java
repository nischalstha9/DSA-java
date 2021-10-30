import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] data = {1,23,123,65,12,77,66,88};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item you want to search");
		int x = sc.nextInt();
		boolean found = false;
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
		int l=0,r=data.length-1;
		
		while (l <= r) {
            int m = (l + r) / 2;
 
            if (data[m] == x)
                System.out.println("Item found at "+m+ " index");
 
            if (data[m] < x)
                l = m + 1;
 
            else
                r = m - 1;
        }
	}
}
