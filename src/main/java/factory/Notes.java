package factory;

public class Notes {
    /* ! Creational design pattern that provides an interface for creating objects in a superclass.
       * Allows subclasses to alter the type of objects that will be created
       * suggests that you replace direct object construction calls, with calls to a special factory method
       * objects returned from a factory method are often called products
     */

    public static void structure(){
        /*  ! 1. interface = Product
            ! 2. FactoryClass (implements interface) = Creator
            ! 3. Subclasses Of FactoryClass =ConcreteCreatorClassA & ConcreteCreatorClassB
            ! 4.  Subclasses of just product (implements interface) = ConcreteProductA & ConcreteProductB

             * ConcreteProductA & ConcreteProductB can be produced by the creator and its subclasses
             * ConcreteProductA & ConcreteProductB are different implementations of the product interface
             * The Creator class declares the factory method that returns new product objects.
  ?^ It’s important that the return type of this method matches the product interface.
 ?^ You can declare the factory method as abstract to force all subclasses to implement their own versions of the method
             * ConcreteCreatorClassA & ConcreteCreatorClassB
             ?^ overrides the base factory method so it returns different ConcreteProducts

         */

    }

}
