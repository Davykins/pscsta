import java.util.*;
// Judges: G: 113

import java.io.*;

public class Nucleotides {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> counts = new TreeMap<String, Integer>();
		
		Scanner fileScan = new Scanner(new File("../judgesdata/nucleotides.dat"));
		String dna = fileScan.nextLine();

		for (int i = 0; i < dna.length(); i++) {
			String nucleotide = dna.charAt(i) + "";
			if (!counts.containsKey(nucleotide)) {
				counts.put(nucleotide, 1);
			} else {
				counts.put(nucleotide, counts.get(nucleotide) + 1);
			}
		}	
		
		System.out.println(counts);
		String nuc = "";
		int max = -1;
		for (String key : counts.keySet()) {
			if (counts.get(key) > max) {
				nuc = key;
				max = counts.get(key);
			}
		}
		
		System.out.println(nuc + ": " + max);
	}
}