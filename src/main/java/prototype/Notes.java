package prototype;

public class Notes {
    // ! A creation Design pattern that lets you copy existing objects without making your code dependent on their class
    /*
    * pattern delegates the cloning process to the actual objects being cloned
    * pattern declares a common interface for all objects that support cloning
    * interface lets you clone without coupling your code to the class of that object
    * interface usually contains just a single clone method
    * Clone method creates an object and carries over all of the field values of the old object into the new one
    * a object that supports cloning is called a prototype
     */

public static void howToImplement(){
  /*  ?Create the prototype interface and declare the clone method in it.
   ? A prototype class must define the alternative constructor that accepts an object of that class as an argument.
// *The constructor must copy the values of all fields defined in the class from the passed object into the newly created instance.
// *If you’re changing a subclass, you must call the parent constructor to let the superclass handle the cloning of its private fields.
    ?The cloning method usually consists of just one line: running a new operator with the prototypical version of the constructor.
    ? Optionally, create a centralized prototype registry to store a catalog of frequently used prototypes
   */
            }


    }