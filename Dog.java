package Animals; // created a package to store Animal classes

/**
 * Dog class
 * 
 * This abstract class will extend the Animal class and
 * implement all of the common interfaces
 * There is one default constructor.
 * 
 * @author sDantzler
 * */

import Common.*; // import the common interfaces package

public abstract class Dog extends Animal
      implements Drawable, Rotateable, Sounds, Resizeable {

   // default empty constructor
   public Dog() {
      super();
   }// end constructor

}// end abstract class Dog
