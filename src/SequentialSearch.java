import java.util.Scanner;

public class SequentialSearch {
	 public static void main(String[] args) {
		int[] data = {1,23,123,65,12,77,66,88};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item you want to search");
		int x = sc.nextInt();
		boolean found = false;
		
		for(int i=0; i<data.length; i++) {
			if (data[i]==x) {
				System.out.println("Item found at "+i+" index");
				found =true;
			}
		}
		if(found==false) {
			System.out.println("Item not found");
		}
	 }
}
