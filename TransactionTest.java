package unitTesting;

import unitTesting.Transaction.TransactionState;
import unitTesting.Transaction.TransactionType;

public class TransactionTest {
	
	public static boolean transactionStateWriteReadTest_COMPLETED() {
		TransactionState testTransactionState = TransactionState.COMPLETED;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionState(testTransactionState);
		TransactionState result = testTransaction.getTransactionState();
		if(testTransactionState == result)
			return true;
		else 
			return false;

	}
	public static boolean transactionStateWriteReadTest_STARTED() {
		TransactionState testTransactionState = TransactionState.STARTED;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionState(testTransactionState);
		TransactionState result = testTransaction.getTransactionState();
		if(testTransactionState == result)
			return true;
		else 
			return false;

	}
	public static boolean transactionStateWriteReadTest_WAITING() {
		TransactionState testTransactionState = TransactionState.WAITING;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionState(testTransactionState);
		TransactionState result = testTransaction.getTransactionState();
		if(testTransactionState == result)
			return true;
		else 
			return false;

	}
	public static boolean transactionStateWrongTypeTest() {
		//placeholder
		return false;
	}
	
	public static boolean transactionTypeWriteReadTest_BUY() {
		TransactionType testTransactionType = TransactionType.BUY;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionType(testTransactionType);
		TransactionType result = testTransaction.getTransactionType();
		if(testTransactionType == result)
			return true;
		else 
			return false;
	}
	public static boolean transactionTypeWriteReadTest_SELL() {
		TransactionType testTransactionType = TransactionType.SELL;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionType(testTransactionType);
		TransactionType result = testTransaction.getTransactionType();
		if(testTransactionType == result)
			return true;
		else 
			return false;
	}
	public static boolean transactionTypeWrongTypeTest() {
		//placeholder
		return false;
	}
	
	public static boolean transactiondataTest() {
		String testDate = "11/11/1111";
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionDate(testDate);
		String result = testTransaction.getTransactionDate();
		if(testDate == result)
			return true;
		else 
			return false;
	}
	public static boolean transactionIsinTest() {
		String testIsin = "String1";
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionIsin(testIsin);
		String result = testTransaction.getTransactionIsin();
		if(testIsin == result)
			return true;
		else 
			return false;
	}
	public static boolean transactionIdTest() {
		int testNumber = 14;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionId(testNumber);
		int result = testTransaction.getTransactionId();
		if(testNumber == result)
			return true;
		else 
			return false;

	}
	public static boolean transactionAmountTest() {
		int testAmount = 17;
		Transaction testTransaction = new Transaction();
		testTransaction.setTransactionAmount(testAmount);
		int result = testTransaction.getTransactionAmount();
		if(testAmount == result)
			return true;
		else 
			return false;

	}

	public static void main(String[] args) {
		
		boolean result = false;
		result = transactionStateWriteReadTest_COMPLETED();
		System.out.println("result: "+ result);
		result = transactionStateWriteReadTest_STARTED();
		System.out.println("result: "+ result);
		result = transactionStateWriteReadTest_WAITING();
		System.out.println("result: "+ result);		
		result = transactionStateWrongTypeTest();
		System.out.println("result: "+ result);
		result = transactionTypeWriteReadTest_BUY();
		System.out.println("result: "+ result);
		result = transactionTypeWriteReadTest_SELL();
		System.out.println("result: "+ result);
		result = transactionTypeWrongTypeTest();
		System.out.println("result: "+ result);
		result = transactiondataTest();
		System.out.println("result: "+ result);
		result = transactionIsinTest();
		System.out.println("result: "+ result);
		result = transactionIdTest();
		System.out.println("result: "+ result);
		result = transactionAmountTest();
		System.out.println("result: "+ result);
		
	}

}
