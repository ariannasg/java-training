package advanced;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // greetingMessage is an anonymous inner class
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        greetingMessage.greet("Ari");

        // using a method reference
        // method references are ways of shortening a lambda expression
        // they are use when the lambda passes on a variable and then calls a method on that variable
        GreetingMessage greetingMessage2 = (System.out::println);
        greetingMessage2.greet("Ari");
    }
}

//CONSOLE OUTPUT:
//Hello Ari
//Ari
