//Sheila Alder
//February 12 2015
//CSE2
//
//demonstrate how you can get input from the user and use that data to perform basic computations
//
//first compile the program
//      javac Check.java
//  run the program
//      java Check//

import java.util.Scanner;


//define a class
public class Check {
//main method required for every Java program
public static void main (String [] args) {

Scanner myScanner = new Scanner( System.in ); //declaring the instance of scanner and creating an instance of calling input from STDIN
System.out.print( "Enter the original cost of the check in the form xx.xx: " ); //prompt user to enter check amount
double checkCost = myScanner.nextDouble(); //accept user input

System.out.print( "Enter the percentage tip that you wish to enter as a whole number (in the form xx): " ); //prompt user for tip amount
double tipPercent =myScanner.nextDouble();
tipPercent= tipPercent/100; //we want to convert the percentage to a decimal value

System.out.print( "Enter the number of people who went out to dinner: "); //prompt user for number of diners
int numPeople = myScanner.nextInt();

double totalCost;
double costPerPerson;
int dollars,dimes,pennies;  //whole dollar amount of cost, dimes, pennies;  
//for storing digits to the right of the decimal point 
//for the cost$
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int) costPerPerson;
//get dimes amount, e.g.,
// (int) (6.73 * 10) % 10 -> 67 % 10 -> 7
// where the % (mod) operator returns the remainder
// after the division;  583%100 ->83, 27%5 -> 2
dimes=(int) (costPerPerson * 10) % 10;
pennies=(int) (costPerPerson * 100) % 10;
System.out.println ( "Each person in the group owes $" + dollars + '.' + dimes + pennies);


}
}
    