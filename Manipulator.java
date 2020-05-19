
/**
 * Manipulator class
 * 
 * This class defines 4 objects, 2 animal and 2 vehicle
 * Each set of objects will then be stored in an array and
 * looped through to demonstrate common interface actions:
 * draw, rotate, resize, and sound
 * 
 * @author sDantzler
 * 
 * */

import Animals.*; // import Animals package
import Vehicles.*; // import Vehicles package

public class Manipulator {

   public static void main(String[] args) {

      // new animal collection to store 2 objects
      Dog[] animalCollection = { new Dachshund(), new Maltese() };

      // for loop to demonstrate common interface actions
      for (int index = 0; index < animalCollection.length; index++) {
         animalCollection[index].drawObject();
         animalCollection[index].rotateObject();
         animalCollection[index].resizeObject();
         animalCollection[index].playSound();
         System.out.println();
      } // end for loop

      // new vehicle collection to store 2 objects
      Toyota[] vehicleCollection = { new Camry(), new Prius() };

      // for loop to demonstrate common interface actions
      for (int index = 0; index < vehicleCollection.length; index++) {
         vehicleCollection[index].drawObject();
         vehicleCollection[index].rotateObject();
         vehicleCollection[index].resizeObject();
         vehicleCollection[index].playSound();
         System.out.println();
      } // end for loop
   }// end main method

}// end class Manipulator
