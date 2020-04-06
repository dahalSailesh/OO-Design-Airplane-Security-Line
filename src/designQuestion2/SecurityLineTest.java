package designQuestion2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecurityLineTest {

	@Test
	public void testEnqueue() {
		SecurityLine line = new SecurityLine();
		
		line.enqueue(new Passenger("Sailesh"));
		line.enqueue(new Passenger("Sijal"));
		line.enqueue(new Passenger("Amit"));
		line.enqueue(new Passenger("Arisa"));
		line.enqueue(new Passenger("Abraham"));
		
		assertEquals(5, line.getLength());
	}
	
	@Test
	public void testDequeue() {
		SecurityLine line = new SecurityLine();
		
		line.enqueue(new Passenger("Sailesh"));
		line.enqueue(new Passenger("Sijal"));
		line.enqueue(new Passenger("Amit"));
		line.enqueue(new Passenger("Arisa"));
		line.enqueue(new Passenger("Abraham"));
		
		line.dequeue();
		line.dequeue();
		
		assertEquals(3, line.getLength());
	}

}
