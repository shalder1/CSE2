//Sheila Alder
//February 9 2016
//CSE2
//
//practice manipulating data stored in variables, running simple calculations, and in printing the numerical output generated. 
//
//first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//define a class
public class Arithmetic {
//main method required for every Java program
public static void main(String[] args) {
    //Number of pairs of pants
    int numPants = 3;
    //Cost per pair of pants
    double pantsPrice = 34.98;
    
    //Number of sweatshirts
    int numShirt = 2;
    //Cost per shirt
    double shirtPrice = 24.99;
    
    //Number of belts
    int numBelts = 1;
    //cost per box of belts
    double beltCost = 33.99;
    
    //the tax rate
    double paSalesTax = 0.06;
    
    double totalCostOfPants = numPants * pantsPrice; //total cost of pants 
    double taxOfPants = totalCostOfPants * paSalesTax;  //tax of pants which does not apply in PA
    double totalCostOfShirts = numShirt * shirtPrice; //total cost of shirts
    double taxOfShirts = totalCostOfShirts * paSalesTax; //tax of shirts which does not apply in PA
    double totalCostOfBetls = numBelts * beltCost; //total cost of belts
    double taxOfBelt = totalCostOfBetls * paSalesTax; //total cost of belts which does not apply in PA
    double subtotal = totalCostOfBetls + totalCostOfPants + totalCostOfShirts; //subtotal of purchase
    double totalSalesTax = taxOfBelt + taxOfPants + taxOfShirts; //total sales tax
    double total = subtotal + totalSalesTax; //total of sale and tax
    
    subtotal = subtotal * 100; //shifted decimal to the right two places
    int subtotal2 = (int)subtotal; //cast double as an int, drops off remaining decimal places
    subtotal = (double)subtotal2/100; //put the decimal back where it belongs, cast back to double
    System.out.println("subtotal: "+subtotal);
    
    totalSalesTax = totalSalesTax * 100; //shifted decimal to the right two places
    int totalSalesTax2 = (int)totalSalesTax; //cast double as an int, drops off remaining decimal places
    totalSalesTax = (double)totalSalesTax2/100; //put the decimal back where it belongs, cast back to double
    System.out.println("totalSalesTax: "+totalSalesTax);
    
    total = total * 100; //shifted the decimal to the right two places
    int total2 = (int)total; //cast double s an int, drops off remaining decimal places
    total = (double)total2/100;  //put the decimal back where it belongs, cast back to double
    System.out.println("total: "+total);
    
    
    
}// main
}// class