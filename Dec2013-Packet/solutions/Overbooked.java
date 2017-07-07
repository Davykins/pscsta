import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Common Greedy Scheduling Algorithm

public class Overbooked { 
	public static void main(String [] args) throws FileNotFoundException {
		Scanner f = new Scanner(new File("overbooked.dat"));
		int N = f.nextInt(); f.nextLine();
		while(N-- > 0) {
			Event[] events = inputFormat(f);
			
			//sorts be ascending order by end time
			Arrays.sort(events);
			
			//always choose even that ends soonest and throw out all others that conflict
			ArrayList<Event> sol = removeConflicts(events);
			
			for(Event e: sol) {
				System.out.print(e +" ");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<Event> removeConflicts(Event[] events) {
		ArrayList<Event> sol = new ArrayList<Event>();
		sol.add(events[0]);
		for(int i = 1; i<events.length; i++) {
			if((events[i-1].endH*100 + events[i-1].endM) < (events[i].startH*100  + events[i].startM))
				sol.add(events[i]);
		}
		return sol;
	}
	
	public static Event [] inputFormat(Scanner f) {
		int dataSize = f.nextInt(); f.nextLine();
		Event [] events = new Event[dataSize];
		while(dataSize-- > 0) {
			String start = f.next();
			start = start.substring(1,start.length()-1);
			String end = f.next();
			end = end.substring(0,end.length()-1);
			Event e = new Event(
					Integer.parseInt(start.substring(0, start.indexOf(":"))), 
					Integer.parseInt(start.substring(start.indexOf(":")+1)),
					Integer.parseInt(end.substring(0, end.indexOf(":"))),
					Integer.parseInt(end.substring(end.indexOf(":") + 1)));
			events[dataSize] = e;
		}
		return events;
	}
}
class Event extends Object implements Comparable<Object>{
	public int startH;
	public int startM;
	public int endH;
	public int endM;
	
	@Override
	public int compareTo(Object o) {
		Event e = (Event) o;
		return (this.endH*100 + this.endM) - (e.endH*100 - e.endM);
	}
	
	public Event(int startH, int startM, int endH, int endM) {
		this.startH = startH;
		this.startM = startM;
		this.endH = endH;
		this.endM = endM;
	}
	
	public String toString() {
		return String.format("(%02d:%02d, %02d:%02d)", startH, startM, endH, endM);
	}
}


