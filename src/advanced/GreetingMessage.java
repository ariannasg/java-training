package advanced;

// a functional interface is an interface that has only one abstract method.
// it allows programmers to pass code around as data (useful for testing?)
@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);

    // this will throw an error if I uncomment it; because it won't longer be a functional interface
    // public abstract void test();
}