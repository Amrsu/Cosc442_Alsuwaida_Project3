/**
 * 
 */
package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException;
import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem;

/**
 * @author am
 *
 */
public class VendingMachineItemTest {

	VendingMachineItem vend;
	@Before
	public void setUp() throws Exception {
		vend = new VendingMachineItem("AM", 5); // create a new object to use it for the following test cases.  
	}

	@After
	public void tearDown() throws Exception {
		vend= null;
		
	}
	
	

	@Test
	public void testVendingMachineItem_1()
		throws Exception {
		String name = "AM";
		double price = 1.0;

		VendingMachineItem result = new VendingMachineItem(name, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals("AM", result.getName());
		assertEquals(1.0, result.getPrice(), 1.0);
	}
	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testVendingMachineItem_2() {
//		throws Exception {
		String name = "AM";
		double price = -5.0;

	VendingMachineItem result2 = new VendingMachineItem(name, price);

	
	try {
		
		assertNotNull(result2);
		assertEquals("AM", result2.getName());
		assertEquals(-5.0, result2.getPrice(), -5.0);
		String msg = "Price cannot be less than zero";
		
	} catch(Exception e) {
		
		assertEquals("Price cannot be less than zero", result2, "Price cannot be less than zero");
	}
	}

	@Test
	public void testGetName() {
		
		
		assertEquals("AM",vend.getName()); // the name is accepted a string
		
	}

	@Test
	public void testGetPrice() {
		
		assertNotSame(5.0,vend.getPrice()); // the price accepted double 
		
	}

}
