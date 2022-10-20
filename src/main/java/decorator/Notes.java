package decorator;

public class Notes {
    /* ! Structural design pattern that lets you attach new behaviors to objects.
        * Places objects inside special wrapper objects that contain the behaivors
        * Componet is the common interface for both wrappers and wrapped objects
        * Concrete Component is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
        * The Base Decorator class has a field for referencing a wrapped object.
        ?^The field’s type should be declared as the component interface so it can contain both concrete components and decorators.
        ?^ The base decorator delegates all operations to the wrapped object.
        * Concrete decorators override methods of the base decorator and execute their behavior either before or after calling the parent method.




     */
}
