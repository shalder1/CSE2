//Sheila Alder
//February 16 2016
//CSE2
//
//practice in writing code that enables the user to input data and gives you practice in performing arithmetic operations. 
//
//first compile the program
//      javac Convert.java
//  run the program
//      java Convert//

import java.util.Scanner;

//define a class
public class Convert {
//main method required for every Java program
public static void main (String [] args) {

Scanner myScanner = new Scanner( System.in ); //declaring the instance of scanner and creating an instance of calling input from STDIN
System.out.print( "Enter the measurement in meters: " ); //prompt user to enter measurement in meters for conversion
double distanceMeters = myScanner.nextDouble(); //accept user input

double totalInches = distanceMeters * 39.3701;

totalInches = totalInches * 10000; //shifted decimal to the right four places
    int totalInches2 = (int)totalInches; //cast double as an int, drops off remaining decimal places
    totalInches = (double)totalInches2/10000; //put the decimal back where it belongs, cast back to double

 System.out.println(distanceMeters+" meters is "+totalInches+" inches.");
}
    }