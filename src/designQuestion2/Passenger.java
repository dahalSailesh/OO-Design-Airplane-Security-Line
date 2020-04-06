package designQuestion2;

import java.util.Random;

public class Passenger implements Comparable<Passenger>{
	private final static int HIGH_PRIORITY = 2;
	private final static int LOW_PRIORITY = 1;
	private String passengerName;
	private int priority;
	
	// Constructor	
	public Passenger(String name) {
		this.passengerName = name;
		
		if(getRandomNum() == 1) {									// "VIP passengers and Staffs only appear 1 in 100 people" 
			this.priority = HIGH_PRIORITY;
		}
		else {
			this.priority = LOW_PRIORITY;
		}
	}
	
	
	/**  returns the name of the Passenger	*/
	public String getName() {
		return this.passengerName;
	}
	
	/**  returns the priority of the Passenger	 */
	public int getPriority() {
		return this.priority;
	}
		
	/**  private method: returns a random number  */
	private int getRandomNum() {
		Random randomNumGenerator = new Random();
		int randomNum = randomNumGenerator.nextInt(100) + 1;
		return randomNum;
	}
	
	@Override
	public int compareTo(Passenger p) {
		if(this.priority < p.priority) {
			return 1;
		}
		else if (this.priority > p.priority) {
			return -1;
		}
		return 0;
	}
	
}
