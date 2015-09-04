package unitTesting;

public class Transaction {
	
	public enum TransactionType {
		BUY, 
		SELL
	}
	public enum TransactionState {
		STARTED, 
		COMPLETED, 
		WAITING
	}
	
	private static TransactionState transactionState;
	private static TransactionType transactionType; 
	private static String data;
	private static String isin;
	private static int transactionId;
	private static int amount;
	private static double executionPrice;
	
	public void setTransactionDate(String newData){
		Transaction.data = newData;
	}
	public void setTransactionId(int newId){
		Transaction.transactionId = newId;
	}
	public void setTransactionType(TransactionType newType){
		Transaction.transactionType = newType;
	}
	public void setTransactionIsin(String newIsin){
		Transaction.isin = newIsin;
	}
	public void setTransactionState (TransactionState newState){
		Transaction.transactionState  = newState;
	}
	public static void setTransactionAmount(int newAmount){
		Transaction.amount = newAmount;
	}
	public static void setExecutionPrice(double newPrice){
		Transaction.executionPrice = newPrice;
	}
		
	public String getTransactionDate(){
		return Transaction.data;
	}
	public int getTransactionId(){
		return Transaction.transactionId;
	}
	public TransactionType getTransactionType(){
		return Transaction.transactionType;
	}
	public String getTransactionIsin(){
		return Transaction.isin;
	}
	public TransactionState getTransactionState (){
		return Transaction.transactionState;
	}
	public int getTransactionAmount(){
		return Transaction.amount;
	}
	public double getExecutionPrice(){
		return Transaction.executionPrice;
	}
}
