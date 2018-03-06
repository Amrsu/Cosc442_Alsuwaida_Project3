package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineExceptionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVendingMachineException_1()
		throws Exception {

		VendingMachineException result = new VendingMachineException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	@Test
	public void testVendingMachineException_2()
		throws Exception {
		String reason = "";

		VendingMachineException result = new VendingMachineException(reason);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

}
