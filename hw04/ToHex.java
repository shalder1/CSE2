//Sheila Alder
//February 23 2016
//CSE2
//
//Gives practice with selection statements, operators, and String manipulation.  
//
//first compile the program
//      javac ToHex.java
//  run the program
//      java ToHex//


import java.util.Scanner;


//define a class
public class ToHex {

public static boolean isThisAnInteger(String RGB)
{  // concept taken from CodeRanch.com and StackOverflow
   try
   {
      Integer.parseInt(RGB);
      return true;
   }
   catch(Exception e)
   {
      return false;
   }
}    

public static String convertToHex(int RGB, String hexOutput)    
{

switch (RGB){
    
    case 10:
    hexOutput = hexOutput + "A";
    return hexOutput;
  
    case 11:
    hexOutput = hexOutput + "B";
    return hexOutput;    

    case 12:
    hexOutput = hexOutput + "C";
    return hexOutput;    

    case 13:
    hexOutput = hexOutput + "D";
    return hexOutput;    

    case 14:
    hexOutput = hexOutput + "E";
    return hexOutput;    

    case 15:
    hexOutput = hexOutput + "F";
    return hexOutput;    

    default:
    hexOutput = hexOutput + RGB;
    return hexOutput;    

}    
}// end of converToHex
    
//main method required for every Java program
public static void main (String [] args) {

Scanner myScanner = new Scanner( System.in ); //declaring the instance of scanner and creating an instance of calling input from STDIN
System.out.print ("Enter RGB value 1: "); //prompting for the user to input the first RPG value
String RGB1 = myScanner.nextLine(); //accept user input
if (isThisAnInteger(RGB1))
{
  int iRGB1 = Integer.parseInt(RGB1);
  if((iRGB1>=0)&&(iRGB1<256))
  {
    System.out.print ("Enter RGB value 2: "); //prompting for the user to input the second RPG value
    String RGB2 = myScanner.nextLine(); //accept user input
    if (isThisAnInteger(RGB2))
    {    
      int iRGB2 = Integer.parseInt(RGB2);
      if((iRGB2>=0)&&(iRGB2<256))
      {
        System.out.print ("Enter RGB value 3: ");  //prompting for the user to input the third RPG value
        String RGB3 = myScanner.nextLine(); //accept user input
        if (isThisAnInteger(RGB3))
        {        
          int iRGB3 = Integer.parseInt(RGB3);
          if((iRGB3>=0)&&(iRGB3<256))
          {
            String hexOutput="";

            int QRGB1=iRGB1/16;
            int MRGB1=iRGB1%16;

            hexOutput = convertToHex(QRGB1, hexOutput);
            hexOutput = convertToHex(MRGB1, hexOutput);


            int QRGB2=iRGB2/16;
            int MRGB2=iRGB2%16;

            hexOutput = convertToHex(QRGB2, hexOutput);
            hexOutput = convertToHex(MRGB2, hexOutput);

            int QRGB3=iRGB3/16;
            int MRGB3=iRGB3%16;

            hexOutput = convertToHex(QRGB3, hexOutput);
            hexOutput = convertToHex(MRGB3, hexOutput);
        
            System.out.println("The decimal numbers R:"+RGB1+", G:"+RGB2+", B: "+RGB3+", is represented in hexadecimal as: "+hexOutput); // output
         } // if RGB3 > 0
         else
         {
            System.out.println("Sorry, you must enter values between 0-255.");  
         } 
        }// if RGB3 is an integer
       else
       {
          System.out.println("Sorry, your input must consist of integers.");
       }
    }// if RGB2 > 0
    else
     {
       System.out.println("Sorry, you must enter values between 0-255.");  
     } 
  } // if RGB2 is an integer
  else
  {
     System.out.println("Sorry, your input must consist of integers.");
  }
  
     
  } // is RGB1 is in range
  else
  {
     System.out.println("Sorry, you must enter values between 0-255.");  
  } 
} // RGB1 is an integer
else
{
    System.out.println("Sorry, your input must consist of integers.");
}

    
}  // main
}

