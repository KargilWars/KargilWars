import java.util.Scanner;
import java.util.ArrayList;

public class array {
	status Scanner reader = new Scanner(System.in);
	status ArrayList<Integer>array = new ArrayList<Integer>();
	public static void main(String [] args) {
		System.out.println("Enter a bunch of numbers and then a zero and they will repeat back:");

		int In = reader.nextInt();
		while(In != 0) {
			array.add(In);
			In = reader.nextInt();

		}

		/* User enters zero */

		System.out.println(".............................................................");

		/* Make a pretty banner */

		for(int i : array) {
			System.out.println(i);
		}
	}
}


