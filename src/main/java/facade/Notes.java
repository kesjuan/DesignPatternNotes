package facade;

public class Notes {
    /* ! Structural design pattern that provides a simplified interface to a library, a framework, or any complex set of classes
    * provides a simple interface to a complex subsystem which contains lots of moving parts.
    * limited functionality in comparison to working with the subsystem directly.
      ?^ it includes only those features that clients really care about.
    * should be responsible for initializing the subsystem and managing its further life cycle
    * Instead of making your code work with dozens of the framework classes directly,
    ?^ you create a facade class which encapsulates that functionality and hides it from the rest of the code.
    ?^ This structure also helps you to minimize the effort of upgrading to future versions of the framework or replacing it with another one.
    ?^The only thing you’d need to change in your app would be the implementation of the facade’s methods.
     */
}
