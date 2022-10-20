package adapter;

public class Notes {
    /* ! Structural design pattern that allows objects with incompatible interfaces to collaborate
     *This is a special object that converts the interface of one object so that another object can understand it
     * An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.
     * The wrapped object isn’t even aware of the adapter.
     * The adapter gets an interface, compatible with one of the existing objects.
        ?^Using this interface, the existing object can safely call the adapter’s methods.
  ?^Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.

     */
}
