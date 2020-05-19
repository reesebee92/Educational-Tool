package Vehicles; // created a package to store Vehicle classes

/**
 * Vehicle class
 * 
 * This abstract class will define a vehicle with the name and age attribute.
 * There is one constructor method (default) and a getter and setter method for
 * the instance variables.
 * 
 * @author sDantzler
 */
public abstract class Vehicle {

   // instance variables
   private String name;
   private int age;

   // default empty constructor
   public Vehicle() {
      this.name = "None";
      this.age = -1;
   }// end constructor

   /**
    * getName method
    * 
    * This method will return the Vehicle name
    */
   public String getName() {
      return name;
   }// end getName method

   /**
    * setName method
    * 
    * This method will set the Vehicle name
    * 
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }// end setName method

   /**
    * getAge method
    * 
    * This method will return the Vehicle age
    */
   public int getAge() {
      return age;
   }// end getAge method

   /**
    * setAge method
    * 
    * This method will set the Vehicle age
    * 
    * @param age
    */
   public void setAge(int age) {
      this.age = age;
   }// end setAge method

}// end Vehicle abstract class
