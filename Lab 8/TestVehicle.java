public class TestVehicle
{
    public static void main(String[]  args) {
        Vehicle v = new Vehicle ("Volkswagen", 4);
        Truck t = new Truck ("Ford", 6, 5.75, 3270);
        Car c = new Car ("Tesla", 4, 4);
        displayObject (v);
        displayObject (t);
        displayObject (c);
    }
    public static void displayObject(Vehicle object) {
        System.out.println (object);
    }
}
//Creates the vehicle class
class Vehicle {
    String manufacturer;
    int wheels;
    public Vehicle (String m, int w) {
        manufacturer = m;
        wheels = w;
    }
    //gets and stores the manufacturer
    public String getManufacturer () {
        return manufacturer;
    }
    //gets and stores the number of wheels
    public int getWheels () {
        return wheels;
    }
    //sets which manufacturer will be output
    public void setManufacturer (String m) {
        manufacturer = m;
    }
    //sets the amount of wheels the current vehicle has
    public void setWheels (int w) {
        wheels = w;
    }
    @Override
    public String toString () {
        return "The manufacturer is: " + manufacturer + ", " + "the number of wheels on the vehicle is: " + String.valueOf (wheels);
    }
}
//Creates the truck class
class Truck extends Vehicle {
    double loadCapacity; 
    int towCapacity;
    public Truck (String m, int w, double l, int t) {
        super (m, w);
        loadCapacity = l;
        towCapacity = t;
    }
    //gets and stores the load capacity
    public double getLoadCapacity () {
        return loadCapacity;
    }
    //gets and stores the tow capacity
    public int getTowCapacity () {
        return towCapacity;
    }
    //sets the load capacity the current vehicle has
    public void setLoadCapacity (double l) {
        loadCapacity = l;
    }  
    //sets the tow capacity the current vehicle has
    public void setTowCapacity (int t) {
        towCapacity = t;
    }
    @Override
    public String toString () {
        return super.toString() + ", the load capacity in US tons is: " + String.valueOf (loadCapacity) + 
            "  and the tow capacity in pounds is: " + String.valueOf (towCapacity);
    }
}
//Creates the car class
class Car extends Vehicle {
    int passengers;
    public Car (String m, int w, int p) {
        super (m, w);
        passengers = p;
    }
    //gets and stores the maximum number of passengers
    public int getPassengers () {
        return passengers;
    }
    //sets the maximum amount of passengers the current vehicle has
    public void setPassengers (int p) {
        passengers = p;
    }
    @Override
    public String toString () {
        return super.toString() + ", the maximum number of passengers is: " + String.valueOf (passengers);
    }
}