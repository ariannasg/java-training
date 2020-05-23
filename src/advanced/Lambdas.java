package advanced;

// from java 8 we can use lambdas.
// lambdas provide a quick and simple way of implementing functional interfaces.
public class Lambdas {
    public static void main(String[] args) {
        // greetingMessage and greetingMessage2 are anonymous inner classes.
        // They are both using lambdas to avoid all the code we had in FunctionalInterface

        // this is a better notation
        GreetingMessage greetingMessage = (name -> System.out.println("Hello " + name));
        greetingMessage.greet("Ari");


        // this is notation from java 8
        GreetingMessage greetingMessage2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        greetingMessage2.greet("Ari");
    }
}

//CONSOLE OUTPUT:
//Hello Ari
//Hello Ari

