/**
 * 
 */
/**
 * @author Balasubramaniam
 *
 */
//grant permission to reflection
open module swipemachineapp {
	//require library
	requires java.logging;
	//compile time library
	requires static org.hamcrest.core;
	//public packages
	exports com.hsbc.swipemachineapp.utilities;
	//access service
	uses com.hsbc.swipemachineapp.dao.TransactionDao;
	//access service and implementation
	provides com.hsbc.swipemachineapp.dao.TransactionDao  
	with com.hsbc.swipemachineapp.dao.
	DirectDebitTransactionImpl;
	
	
	
}