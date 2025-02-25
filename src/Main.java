import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner sc;
		String stringNums;
		int N = 8; //First line - number of element
		List<Integer> nums = new ArrayList<>();
		//in.nextLine(); // Consuming the /n
		stringNums = "1 2 3 4 5 6 7 8"; //Second line - numbers
		sc = new Scanner(stringNums);
		int Q = 6;
		String query;
		String insert;
		int x;
		int y;
		
		for(int i = 0; i<N; i++) {
			nums.add(sc.nextInt());
		}
		
		sc.close();
		
		//Test
		for(int i = 0; i<nums.size(); i++) {
			System.out.print(nums.get(i));
		}
		System.out.println();
		//Q = in.nextInt();
		//in.nextLine(); // Consuming the /n
		
		for(int i = 0; i<Q; i++) {
			
			query = in.nextLine();
			//System.out.println(query);
			if(query.equals("Insert")) {
                insert = in.nextLine();
                //System.out.println("Insert : " + insert);
				sc = new Scanner(insert);
				x = sc.nextInt();
				y = sc.nextInt();
				//System.out.println("x, y : " + x + ", " + y);
				sc.close();
				nums.add(x, y);
			} else if(query.equals("Delete")) {
				x = in.nextInt();
				//System.out.println("x : " + x);
				nums.remove(x);
				in.nextLine();
			}
			
		}
		
		for(int i = 0; i<nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		sc.close();
		in.close();
	}
	
}
