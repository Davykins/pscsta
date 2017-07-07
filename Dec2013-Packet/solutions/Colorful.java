import java.util.*;
import java.io.*;

public class Colorful {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../judgesdata/colorful.dat"));
		
		fileScan.nextLine();
		String currColor = "";
		int colorCount = 0;
		
		while (fileScan.hasNextLine()) {
			String line = fileScan.nextLine();
			Scanner lineScan = new Scanner(line);
			lineScan.next();
			String color = lineScan.next();
			
			if (!currColor.equals(color)) {
				currColor = color;
				colorCount++;
			}
		}
		
		System.out.println(colorCount);
	}
}