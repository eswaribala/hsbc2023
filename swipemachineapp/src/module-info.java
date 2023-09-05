/**
 * 
 */
/**
 * @author Balasubramaniam
 *
 */
//grant permission to reflection
open module com.hsbc.swipemachineapp {
	//require library
	requires java.logging;
	//compile time library
	//requires static org.hamcrest.core;
	//public packages
	exports com.hsbc.swipemachineapp.utilities;
	//exports com.hsbc.swipemachineapp.dao;
	//access service
	//uses com.hsbc.swipemachineapp.dao.TransactionDao;
	//access service and implementation
	//provides com.hsbc.swipemachineapp.dao.TransactionDao  
	//with com.hsbc.swipemachineapp.dao.DirectDebitTransactionImpl;
	
	
	
}