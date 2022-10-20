package composite;

public class Notes {
    /* ! Structural design pattern that lets you compose objects into tree stuctures
    *Using the Composite pattern makes sense only when the core model of your app can be represented as a tree
    * The Composite pattern suggests that you work with Products and Boxes through a common interface
    * interface describes operations that are common to both simple and complex elements of the tree.
    * Leaf is a basic element of a tree that doesn’t have sub-elements.
  ?^Usually, leaf components end up doing most of the real work, since they don’t have anyone to delegate the work to
    * The Container (aka composite) is an element that has sub-elements leaves or other containers.
    ?^ Upon receiving a request, a container delegates the work to its sub-elements,
     ? ^ processes intermediate results and then returns the final result to the client.
    * define the methods for adding and removal of child elements in the container.
     */
}
