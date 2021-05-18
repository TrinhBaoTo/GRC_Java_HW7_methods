// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #7, 10/19/19

// This program's behavior is to accepts three integer values that represent the three lengths of a triangle.  
// The method should then return the area of the triangle back as a double.

import java.util.Scanner;


public class HW7
{// open class

   public static void main(String[] args)
   {//open main
      Scanner area = new Scanner(System.in); //open scanner class
   
      System.out.print("Please type in the sides a length of the triangle  :");
      //input for a
      int a = area.nextInt();
      System.out.print("Please type in the sides b length of the triangle  :");
      //input for b
      int b = area.nextInt();
      System.out.print("Please type in the sides c length of the triangle  :");
      //input for c
      int c = area.nextInt();
      
    
      double Area= triangleArea(a,b,c);
      // call method to calculate the area
      System.out.println(Area);
   
   }//end main
   
   public static double triangleArea(int a,int b,int c)
   {//open static method
    double s=(a+b+c)/2;
    //find s
    double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    //find Area
    return Area;
   }//end static method
   
}//end class