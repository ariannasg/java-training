package advanced;

import java.util.ArrayList;
import java.util.List;

// wildcards can help solving the issue we encounter when using the substitution principle with lists types
// Wildcards can also be used to specify the super types that can be used when a subtype is specified.
public class Wildcards {
    public static void main(String[] args) {
        System.out.println("Now we can pass in to the method, lists of any types that extend from Building");
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        printBuildings(offices);
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        printBuildings(houses);

        System.out.println("\nUsing wildcards to specify the super type used");
        System.out.println("List of houses before adding another house: ");
        printBuildings(houses);
        addHouseToList(houses);
        System.out.println("List of buildings after adding a house: ");
        printBuildings(houses);
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        System.out.println("List of buildings before adding a house: ");
        printBuildings(buildings);
        addHouseToList(buildings);
        System.out.println("List of buildings after adding a house: ");
        printBuildings(buildings);
    }

    static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
    }
}

//CONSOLE OUTPUT:
//Now we can pass in to the method, lists of any types that extend from Building
//office 1
//house 1
//
//Using wildcards to specify the super type used
//List of houses before adding another house:
//house 1
//List of buildings after adding a house:
//house 1
//house 2
//List of buildings before adding a house:
//building 1
//List of buildings after adding a house:
//building 1
//house 2
