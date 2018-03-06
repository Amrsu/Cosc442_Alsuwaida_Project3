/**
 * 
 */
package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine;
import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException;
import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem;

/**
 * @author am
 *
 */
public class VendingMachineTest {

	/**
	 * @throws java.lang.Exception
	 */
	VendingMachine vend;
	VendingMachine vend2;
	VendingMachine vend3;
	VendingMachine vend4;
	VendingMachineItem[] itemArray;
	VendingMachineItem VendingItems;
	
	@Before
	public void setUp() throws Exception {
		
		vend = new VendingMachine();
		vend2 = new VendingMachine();
		vend3 = new VendingMachine();
		vend4 = new VendingMachine();
		itemArray = new  VendingMachineItem[4];
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		vend=null;
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	
	@Test
	public void testArray() {
		
		assertEquals(4, itemArray.length); // testing if the array length is 4
		
	}
	@Test
	public void testAddItem() {
		
		//testing each item with different objects.
		
		vend.addItem(VendingItems, VendingMachine.A_CODE);
		assertEquals(VendingItems, vend.getItem(VendingMachine.A_CODE));
		
		vend2.addItem(VendingItems, VendingMachine.B_CODE);
		assertEquals(VendingItems, vend2.getItem(VendingMachine.B_CODE));
		
		vend3.addItem(VendingItems, VendingMachine.C_CODE);
		assertEquals(VendingItems, vend3.getItem(VendingMachine.C_CODE));
		
		vend4.addItem(VendingItems, VendingMachine.D_CODE);
		assertEquals(VendingItems, vend4.getItem(VendingMachine.D_CODE));
		

	}

	
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/5/18 8:39 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}
	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);
		
		assertNull(fixture);

		// add additional test code here
	}
	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);
		
		assertNull(fixture);

		// add additional test code here
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}
	
	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}
	
	
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
//	@Test(expected=VendingMachineException.class) 
//	public void testInsertMoney() {
//		
//		//trying different integers to all objects.
//		
//		vend.insertMoney(1.00);
//		assertEquals(1.00, vend.getBalance(),1.00);
//		
//		vend2.insertMoney(2.00);
//		assertEquals(2.00, vend2.getBalance(),2.00);
//		
//		vend3.insertMoney(3.00);
//		assertEquals(3.00, vend3.getBalance(),3.00);
//		
//		vend4.insertMoney(4.00);
//		assertEquals(4.00, vend4.getBalance(),4.00);
//	}
	
//	@Test(expected=VendingMachineException.class) 
//	
//	// found this on exception in 
//	// https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests
//	
//	public void testInsertMoneyLessThan0() {
//		
//		//test all objects with a money less than 0.
////
////		vend.insertMoney(-1.00);
////		assertEquals(-1.00, vend.getBalance(),-1.00);
////		
////		vend2.insertMoney(-2.00);
////		assertEquals(-2.00, vend2.getBalance(),-2.00);
////		
////		vend3.insertMoney(-3.00);
////		assertEquals(3.00, vend3.getBalance(),-3.00);
////		
////		vend4.insertMoney(-4.00);
////		assertEquals(-4.00, vend4.getBalance(),-4.00);
////	
//	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#getBalance()}.
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 */
	
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}
	
//	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
//	public void testGetItem_2()
//		throws Exception {
//		VendingMachine fixture = new VendingMachine();
//		fixture.balance = 1.0;
//		String code = "A";
//
//		VendingMachineItem result = fixture.getItem(code);
//
//		// add additional test code here
//		fixture.getItem(result.getName());
//		//assertNull(result);
//		//assertEquals(result, fixture.getItem(code));
//		
//		
//	}
	
	
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}
	
	
	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4;

		fixture.insertMoney(amount);

		
		
	}
	
	
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "C";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}
	
	
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "B";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "D";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertFalse(result);
		
	}
	
	
	
	
	
//	/**
//	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#returnChange()}.
//	 */
//	@Test
//	public void testReturnChange() {
//		
//		// testing and making sure that the change return and the balance become 0
//		vend.insertMoney(1.0);
//		assertEquals(1.0,vend.returnChange(),0.0);
//		assertEquals(0.0,vend.getBalance(), 0.0 );
//		
//		vend2.insertMoney(2.0);
//		assertEquals(1.0,vend2.returnChange(),1.0);
//		assertEquals(0.0,vend2.getBalance(), 0.0 );
//		
//		vend3.insertMoney(3.0);
//		assertEquals(2.0,vend3.returnChange(),2.0);
//		assertEquals(0.0,vend3.getBalance(), 0.0 );
//		
//		vend4.insertMoney(4.0);
//		assertEquals(3.0,vend4.returnChange(),3.0);
//		assertEquals(0.0,vend4.getBalance(), 0.0 );
//		
//	}

	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

}

