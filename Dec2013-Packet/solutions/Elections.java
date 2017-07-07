import java.util.*;
import java.io.*;

public class Elections {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/elections.dat"));
		
		fileScan.nextLine();
		
		int arlondra = 0;
		int dahlia = 0;
		
		while (fileScan.hasNextLine()) {
			String vote = fileScan.nextLine();
			if (vote.equals("Arlondra")) {
				arlondra++;
			} else {
				dahlia++;
			}
		}
		
		System.out.println("Arlondra: " + arlondra);
		System.out.println("Dahlia: " + dahlia);
		
		if (arlondra > dahlia) {
			System.out.print("Arlondra ");
		} else {
			System.out.print("Dahlia ");
		}
		
		System.out.println("is your new president!");
	}
}