import java.util.*;
import java.io.*;

public class DryRun {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/dryrun.dat"));
		
		fileScan.nextLine();
		
		while (fileScan.hasNextLine()) {
			String occupation = fileScan.nextLine();
			System.out.println("I wish I were a " + occupation + ".");
		}
	}
}