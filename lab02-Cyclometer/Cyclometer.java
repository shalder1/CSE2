//Sheila Alder
//February 5 2015
//CSE2
//
//This program will measure the speed and distance of the rotation of the front bicycle tire
//
//first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//define a class
public class Cyclometer {
//main method required for every Java program
public static void main (String [] args) {
    
    
int secsTrip1=480; //Trip1 is 480 seconds
int secsTrip2=3220; //Trip2 is 3220
int countsTrip1=1561; //Trip1 count is 1560
int countsTrip2=9037; //Trip2 count is 9037
//our intermediate variables and output data

double wheelDiameter=27.0, //assign wheelDiamter as double 27.0
PI=3.14159,  //defining PI
feetPerMile=5280,  //defining that there are 5280 feet in a mile
inchesPerFoot=12,  //defining that there are 12 inches are in a foot
secondsPerMinute=60;  //defining that there are 60 seconds in a minute
double distanceTrip1, distanceTrip2, totalDistance;  //declaring the data and the variables and data time

System.out.println("Trip 1 took "+
     (secsTrip1/secondsPerMinute)+" minutes and had "+
     countsTrip1+" counts.");
     System.out.println("Trip 2 took "+
     (secsTrip2/secondsPerMinute)+ " minutes and had "+
     countsTrip2+" counts.");
     //run the calcuations; store the values. Document your
     //calculations here.  What are you calculating?
     //calculating the distance of rotations and the speed taking into accout the wheel diameter
     //
     distanceTrip1=countsTrip1*wheelDiameter*PI;
     //Above gives distance in inches
     //(for each count, a roation of the wheel travels
     //the diameter in inches times PI)
     distanceTrip1/=inchesPerFoot*feetPerMile;  //gives distance in miles
     distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
     totalDistance=distanceTrip1+distanceTrip2;
     //
     //Print out the output data.
     System.out.println("Trip 1 was "+distanceTrip1+" miles");
     System.out.println("Trip 2 was "+distanceTrip2+" miles");
     System.out.println("The total distance was "+totalDistance+" miles");
     

     
     
//System.out.println("Sheila");
     }   //end of main method
}    //end of class
//our input data
