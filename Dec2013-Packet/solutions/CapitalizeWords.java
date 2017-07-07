import java.util.*;
import java.io.*;

public class CapitalizeWords {
	public static void main (String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/capitalizewords.dat"));
		
		String str = fileScan.nextLine();
		int num = fileScan.nextInt();
		
		Scanner lineScan = new Scanner(str);
		int cap = 0;
		while (lineScan.hasNext()) {
			if (cap < num) {
				cap++;
				System.out.print(lineScan.next().toUpperCase() + " ");
			} else {
				System.out.print(lineScan.next() + " ");
			}
		}
	}
}