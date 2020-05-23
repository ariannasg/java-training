package advanced;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void serve() {
        System.out.println(name + " has been served");
    }

    @Override
    public String toString() {
        return name;
    }
}
