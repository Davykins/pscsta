import java.util.*;
import java.io.*;

public class DigitSum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File("../studentdata/digitsum.dat"));
		int num = fileScan.nextInt();
			
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}

		System.out.println(sum);

// 		int ones = num % 10;
// 		num /= 10;
// 		int tens = num % 10;
// 		num /= 10;
// 		int hundreds = num % 10;
// 		System.out.println(ones + tens + hundreds);
	}
}