TEST APPROACH

0 create class and write unit tests
- write unit tests for the class 


1 create test data generator
- use class from previous phase when writing this program, run the unit tests to validate class
- go thru acceptance criteria
- validate the application behaviour for entering in a number of rows parameter values other than digits (float, negative numbers, letters, special characters, big numbers)
- check if the data is really random 
- consider checking the performance of application (for big amount of generated data)
- consider verifying if there is no memory leak
- consider verifying the UI, check the usability


2 create data reader
- use class from previous phase when writing this program, run the unit tests to validate class
- go thru acceptance criteria
- provide file other than csv (.jpg or .docx)
- provide the csv file with data different than expected
	- other types 
	- characters in place of digits
	- column separators other than comma
	- comma after the last column
	- only data (without column description)
	- empty file
	- numbers bigger than expected
	- floats with more than 4 digits after comma
	- floats with less than 4 digits after comma
	- think about some more cases
- provide a filename that contain illegal characters like eg /-<>{}
- provide empty string as a filename
- check if transactions other than Completed are not used in aggregation
- consider checking the performance of application (for big amount of generated data)
- consider verifying if there is no memory leak
- consider verifying the UI, check the usability


3 integration test
- run program that generates data
- save generatred csv file
- run program that reads data
- select the saved csv file as a parameter
- verify if there are results printed
