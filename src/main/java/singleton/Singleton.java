package singleton;

public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
/*   * Add a private static field to the class for storing the singleton instance.
//
//    * Declare a public static creation method for getting the singleton instance.
//
//    * Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
//
//    * Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
//
     *  Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.
*/
}
