//Connor Jonker
//#100374615

public class GenericMethod_JonkerConnor {

    // main method
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};

        GenericMethod_JonkerConnor.print(integers);
        GenericMethod_JonkerConnor.print(strings);

        /*Code for creating objects of custom classes and calling GenericMethod_JonkerConnor.print on array of those objects*/
        // Avengers class
        Avengers a1 = new Avengers("Matthew J. Hawkins");
        Avengers a2 = new Avengers("Clint Barton");
        Avengers[] avengers = {a1, a2};
        GenericMethod_JonkerConnor.print(avengers);

        // For Identity class
        Identity p1 = new Identity(a1.getTrueIdentity());
        Identity p2 = new Identity(a2.getTrueIdentity());
        Identity Identitys[] = {p1, p2};
        GenericMethod_JonkerConnor.print(Identitys);

        // For Aggregates class
        Aggregates f1 = new Aggregates("Gravel");
        Aggregates f2 = new Aggregates("Sand");
        Aggregates Aggregatess[] = {f1, f2};
        GenericMethod_JonkerConnor.print(Aggregatess);
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("");
    }
}

// Define Avengers as custom class
class Avengers {

    private String trueIdentity;

    public Avengers(String trueIdentity) {
        this.trueIdentity = trueIdentity;
    }

    public String getTrueIdentity() {
        return trueIdentity;
    }

}

// Define Aggregates as custom class
class Aggregates {

    private String name;

    public Aggregates(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", ";
    }

}

// Define Identity as custom class
class Identity {

    private String name;

    public Identity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", ";
    }

}