package Vehicles; // created a package to store Vehicle classes

/**
 * Toyota class
 * 
 * This abstract class will extend the Vehicles class and
 * implement all of the common interfaces
 * There is one default constructor.
 * 
 * @author sDantzler
 * */

import Common.*; // import the common interfaces package

public abstract class Toyota extends Vehicle
      implements Drawable, Rotateable, Sounds, Resizeable {

   // default empty constructor
   public Toyota() {
      super();
   }// end constructor

}// end abstract class Toyota
