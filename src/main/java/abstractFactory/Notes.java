package abstractFactory;

public class Notes {
    /* ! A creational design pattern that lets you produce families of related objects without specifying their concrete classes
    *   Familys of products with different variants
    * Explicitly declare interfaces for each distinct product of the product family
    * then you can make all variants of products follow those interfaces
    * declare the Abstract Factory an interface with a list of creation methods for all products that are part of the product family
    ?^ These methods must return abstract product types represented by the interfaces
    * For each variant of a product family, we create a separate factory class based on the AbstractFactory interface
    ?^ A factory is a class that returns products of a particular kind.
    * For example ModernFurnitureFactory can only create modernFurniture objects

     */
}
