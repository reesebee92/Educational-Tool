package Vehicles; // created a package to store Vehicle classes

/**
 * Camry class
 * 
 * This class includes a default constructor and four common interfaces extended
 * from the abstract Toyota class
 */
public class Camry extends Toyota {

   // default empty constructor
   public Camry() {
      super();
   }// end constructor

   /**
    * drawObject method
    * 
    * This method will print the action required to draw a Camry
    */
   public void drawObject() {
      System.out.println("Drawing a Camry");
   }// end drawObject method

   /**
    * resizeObject method
    * 
    * This method will print the action required to resize a Camry
    */
   public void resizeObject() {
      System.out.println("Resizing a Camry");
   }// end resizeObject method

   /**
    * rotateObject method
    * 
    * This method will print the action required to rotate a Camry
    */
   public void rotateObject() {
      System.out.println("Rotating a Camry");
   }// end rotateObject method

   /**
    * playSound method
    * 
    * This method will print the action required to represent the sound of a
    * Camry
    */
   public void playSound() {
      System.out.println("Camry sound");
   }// end playSound method

}// end Camry class