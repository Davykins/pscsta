import java.util.*;
import java.io.*;

public class Raffle {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/raffle.dat"));
		
		int count = fileScan.nextInt();
		
		int max = -1;
		int max2 = -1;
		for (int i = 0; i < count; i++) {
			int number = fileScan.nextInt();
			if (number > max) {
				max2 = max;
				max = number;
			} else if (number > max2) {
				max2 = number;
			}
		}
		
		System.out.println(max2);
	}
}