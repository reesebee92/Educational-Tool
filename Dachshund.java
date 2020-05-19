package Animals;// created a package to store Animal classes

/**
 * Dachshund class
 * 
 * This class includes a default constructor and four common
 * interfaces extended from the abstract Dog class
 * */
public class Dachshund extends Dog{
   
   // default empty constructor
   public Dachshund() {
      super();
   }// end constructor
   
   /**
    * drawObject method
    * 
    * This method will print the action required to draw a Dachshund
    */
   public void drawObject() {
      System.out.println("Drawing a Dachshund");
   }// end drawObject method
   
   /**
    * resizeObject method
    * 
    * This method will print the action required to resize a Dachshund
    */
   public void resizeObject() {
      System.out.println("Resizing a Dachshund");
   }// end resizeObject method
   
   /**
    * rotateObject method
    * 
    * This method will print the action required to rotate a Dachshund
    */
   public void rotateObject() {
      System.out.println("Rotating a Dachshund");
   }// end rotateObject method
   
   /**
    * playSound method
    * 
    * This method will print the action required to represent the sound of a
    * Dachshund
    */
   public void playSound() {
      System.out.println("Dachshund sound");
   }// end playSound method

}// end Dachshund class
