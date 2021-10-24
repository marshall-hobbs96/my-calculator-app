# my-calculator-app
This application creates a local server that can be connected to via a standard web browser via port 8080. 
The webpage will open up a simple interface for inputting two numbers to either add, subtract, multiply or divide. 
You can then input any number into the two fields and click the corrosponding buttons in order to perform the 
assosicated arithmetic function on them. 

This program uses javalin to run the server on the backend. 

# selenium-test
This application automates testing on the my-calculator-app application.  So far, for each arithmetic function, it fills out both number fields and 
pressed the corrosponding button. It then checks to make sure the answer is correct, and prints the test result into the console. 

# TO-DO
* Add additional tests to...
	- make sure the proper response is displayed when either or both fields are left blank and the add, subtract, etc. button is pressed. 
*add additional functionality to the calculator-app such as...
	- modulo
	- exponents? 
	- sqrt...which is pretty much the same as exponents
	- idk maybe ill just try to make a full on ti-84, why not