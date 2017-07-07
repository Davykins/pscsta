import java.util.*;
import java.io.*;

public class Demographics {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/demographics.dat"));
		fileScan.nextLine();
		
		Map<String, List<Integer>> ages = new HashMap<String, List<Integer>>();
		
		while (fileScan.hasNextLine()) {
			Scanner lineScan = new Scanner(fileScan.nextLine());
			
			lineScan.next();
			String city = lineScan.next();
			int age = lineScan.nextInt();
			
			if (!ages.containsKey(city)) {
				ages.put(city, new ArrayList<Integer>());
			}
			ages.get(city).add(age);
		}
		
		double min = Integer.MAX_VALUE;
		String minCity = "";
		for (String city : ages.keySet()) {
			int sum = 0;
			for (int age : ages.get(city)) {
				sum += age;
			}
			double avg = 1.0 * sum / ages.get(city).size();
			if (avg < min) {
				min = avg;
				minCity = city;
			}
		}
		
		System.out.println(minCity + ": " + min);
	}
}
