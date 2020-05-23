package advanced;

import java.util.ArrayList;
import java.util.List;

// the Substitution Principle allows to assign variables of a given type to their subtype, i.e: build()
// but this principle does not apply with types of lists -> this is why printBuildings(offices) throws error
public class SubstitutionPrinciple {
    public static void main(String[] args) {
        System.out.println("The principle works when assigning variables of a given type to their subtype");
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        System.out.println("\nThe principle does not work with types of lists");
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
//        printBuildings(offices);

    }

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    static void printBuildings(List<Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
}

//CONSOLE OUTPUT:
//The principle works when assigning variables of a given type to their subtype
//Constructing a new building
//Constructing a new office
//
//The principle does not work with types of lists
//1: building
//2: office
