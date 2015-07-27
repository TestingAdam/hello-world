0 create class and write unit tests
- all unit tests passes 


1 create test data generator
- program generates file ia a *.csv file
- it is possible to provide a number of rows as a parameter
- data validation
	- first row has a columns description that is given
	- there are 7 columns:
		- 1st column is a date
		- 2nd column is trade id (number, 10 random digits, integer)
		- 3rd is transaction type, only BUY and SELL, capital letters
		- 4th is isin, string starting with US (capital) and 10 random characters (letters capital and digits)
		- 5th is state, only STARTED, WAITING, COMPLETED capitals
		- 6th is amount, 4 digits integer, positive or negative
		- 7th is execution price, float with 4 digits after comma
	- date is starting from today, next lines are a consecutives dates
	- date format is dd-mm-yyyy
	- rows are comma separated, after last column there is no comma

	


2 create data reader
- program reads data from *.csv file
- it is possible possible to provide a filename to read data from
- prints results (summary of transaction per month)
- summary data validation 
(contain no. of transactions and aggregated values (amount * execution price) for completed buy and sell transactions: eg 15 (amount * execution price))
	- results data format (month numberOfTransaction amt*exePrice)
	- print summary per month
	- only for COMPLETED transaction 
	- aggregation
	- (amount * execution price)
	

