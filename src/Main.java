import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //First line - number of element
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			nums.add(in.nextInt());
		}
		
		int Q = in.nextInt();
		
		for(int i = 0; i<Q; i++) {
			
			String query = in.next();
			
			if(query.equals("Insert")) {
				nums.add(in.nextInt(), in.nextInt());
			} else if(query.equals("Delete")) {
				nums.remove(in.nextInt());
			}
			
		}
		
		for(int i = 0; i<nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		in.close();
	}
	
}
