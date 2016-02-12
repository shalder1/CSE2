//Sheila Alder
//February 16 2016
//CSE2
//
//practice in writing code that enables the user to input data and gives you practice in performing arithmetic operations. 
//
//first compile the program
//      javac Pyramid.java
//  run the program
//      java Convert//

import java.util.Scanner;

//define a class
public class Pyramid {
//main method required for every Java program
public static void main (String [] args) {

Scanner myScanner = new Scanner( System.in ); //declaring the instance of scanner and creating an instance of calling input from STDIN
System.out.print( "Enter the square side measurement of pyramid: " ); //prompt user to enter measurement of square side of pyramid
double squareSide = myScanner.nextDouble(); //accept user input


System.out.print( "Enter the height of pyramid: " ); //prompt user to enter measurement of height of pyramid
double height = myScanner.nextDouble(); //accept user input


double volume = (squareSide*squareSide*height)/3;


 System.out.println("The volume inside the pyramid is: "+ volume + ".");


    }
    }