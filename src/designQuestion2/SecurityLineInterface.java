package designQuestion2;

public interface SecurityLineInterface {

	/**	adds a type Passenger to the security line  */
	public void enqueue(Passenger newPassenger);
	
	/**  returns a type Passenger to the security line	*/
	public Passenger dequeue();
	
	/**  returns the length of the security line  */
	public int getLength();
}
