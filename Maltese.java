package Animals; // created a package to store Animal classes

/**
 * Maltese class
 * 
 * This class includes a default constructor and four common
 * interfaces extended from the abstract Dog class
 * */
public class Maltese extends Dog {

   // default empty constructor
   public Maltese() {
      super();
   }// end constructor

   /**
    * drawObject method
    * 
    * This method will print the action required to draw a Maltese
    */
   public void drawObject() {
      System.out.println("Drawing a Maltese");
   }// end drawObject method

   /**
    * resizeObject method
    * 
    * This method will print the action required to resize a Maltese
    */
   public void resizeObject() {
      System.out.println("Resizing a Maltese");
   }// end resizeObject method

   /**
    * rotateObject method
    * 
    * This method will print the action required to rotate a Maltese
    */
   public void rotateObject() {
      System.out.println("Rotating a Maltese");
   }// end rotateObject method

   /**
    * playSound method
    * 
    * This method will print the action required to represent the sound of a
    * Maltese
    */
   public void playSound() {
      System.out.println("Maltese sound");
   }// end playSound method

}// end Maltese class