import java.util.*;
import java.io.*;

public class Wakeup {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/wakeup2.dat"));
		
		String day = fileScan.nextLine();
		
		if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("Wake up, it's " + day + "!");
		} else {
			System.out.println("Relax, it's " + day + "!");
		}
	}
}