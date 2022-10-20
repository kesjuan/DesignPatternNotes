package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        // Director gets the concrete builder object from the client
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        // final object is retrieved from a builder object since director is not aware and not dependent on concrete builders and products.
        Car car = builder.getResult();

        CarManualBuilder manualBuilder = new CarManualBuilder();

        //Director may know several building recipes
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println(carManual.print());


    }

}
