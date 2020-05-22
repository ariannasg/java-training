package basics;

public class Triangle {
    // class variables (or static vars)
    static int numOfSides = 3;

    // instance variables (or non-static vars)
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // this is an instance method or non-static method. It needs to be called using an instance of the class.
    public double findArea() {
        return (this.base * this.height) / 2;
    }

    // this is a class method or static method. It needs to be called using the class name directly.
    public static void showPurpose() {
        System.out.println("This is the representation of a basics.Triangle");
    }

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(10, 10, 10, 10, 10);
        Triangle triangleB = new Triangle(8, 15, 5, 5, 5);

        System.out.println("TriangleA area is " + triangleA.findArea());
        System.out.println("TriangleA base is " + triangleA.base);
        System.out.println("TriangleB area is " + triangleB.findArea());
        System.out.println("TriangleB height is " + triangleB.height);

        Triangle.showPurpose();
        System.out.println("A basics.Triangle has " + Triangle.numOfSides + " sides.");
    }
}

//CONSOLE OUTPUT:
//TriangleA area is 50.0
//TriangleA base is 10.0
//TriangleB area is 60.0
//TriangleB height is 15.0
//This is the representation of a basics.Triangle
//A basics.Triangle has 3 sides.