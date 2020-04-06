package designQuestion2;

import java.util.PriorityQueue;

public class SecurityLine implements SecurityLineInterface{
	PriorityQueue<Passenger> passengerQ;
	
	// Constructor	
	public SecurityLine() {
		this.passengerQ = new PriorityQueue<Passenger>();
	}
	
	
	public void enqueue(Passenger newPassenger){
		this.passengerQ.add(newPassenger);
	}

	public Passenger dequeue() {
		if(this.passengerQ.size() == 0) {
			System.out.println("No passenger in line.");
		}
		return this.passengerQ.poll();
	}
	
	public int getLength() {
		return this.passengerQ.size();
	}
}
