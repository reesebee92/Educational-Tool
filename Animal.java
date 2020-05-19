package Animals; // created a package to store Animal classes

/**
 * Animal class
 * 
 * This abstract class will define an animal with the name attribute. There is
 * one constructor method (default) and a getter and setter method for the
 * instance variable.
 * 
 * @author sDantzler
 */
public abstract class Animal {

   // instance variable
   private String name;

   // default empty constructor
   public Animal() {
      this.name = "None";
   }// end constructor

   /**
    * getName method
    * 
    * This method will return the Animal name
    */
   public String getName() {
      return name;
   }// end getName method

   /**
    * setName method
    * 
    * This method will set the Animal name
    * 
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }// end setName method

}// end Animal abstract class
