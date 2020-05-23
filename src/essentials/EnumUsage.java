package essentials;

public enum EnumUsage {
    S("small"),
    M("medium"),
    L("large");

    private String description;

    EnumUsage(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static void main(String[] args) {
        System.out.println("Shirt size: " + EnumUsage.S);
        System.out.println("Shirt size: " + EnumUsage.M);
        System.out.println("Shirt size: " + EnumUsage.L);
    }
}

//CONSOLE OUTPUT:
//Shirt size: small
//Shirt size: medium
//Shirt size: large
