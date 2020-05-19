package Vehicles; // created a package to store Vehicle classes

/**
 * Prius class
 * 
 * This class includes a default constructor and four common interfaces extended
 * from the abstract Toyota class
 */
public class Prius extends Toyota {

   // default empty constructor
   public Prius() {
      super();
   }// end constructor

   /**
    * drawObject method
    * 
    * This method will print the action required to draw a Prius
    */
   public void drawObject() {
      System.out.println("Drawing a Prius");
   }// end drawObject method

   /**
    * resizeObject method
    * 
    * This method will print the action required to resize a Prius
    */
   public void resizeObject() {
      System.out.println("Resizing a Prius");
   }// end resizeObject method

   /**
    * rotateObject method
    * 
    * This method will print the action required to rotate a Prius
    */
   public void rotateObject() {
      System.out.println("Rotating a Prius");
   }// end rotateObject method

   /**
    * playSound method
    * 
    * This method will print the action required to represent the sound of a
    * Prius
    */
   public void playSound() {
      System.out.println("Prius sound");
   }// end playSound method

}// end Prius class