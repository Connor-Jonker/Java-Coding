import java.util.*;

class Car {

  static int last = 0;
  int serialNumber = 54321;
  String make;
  String model;
  int year;
  double price;

  public int getSerialNumber() {
    return this.serialNumber;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  Car(String make, String model, int year, double price) {
    this.serialNumber = last + 1;
    last += 1;
    this.make = make;
    this.year = year;
    this.model = model;
    this.price = price;
  }

  Car() {
    this("", "", 0, 0.0);
  }
}

class CarDealer {

  String name;
  int numCars;
  List<Car> cars; 

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumCars() {
    return this.numCars;
  }

  public void setNumCars(int numCars) {
    this.numCars = numCars;
  }

  public void AddCar(Car obj) {
    cars.add(obj);
  }

  public List<Car> getCar() {
    return cars;
  }

  CarDealer(String name, int num) {
    this.name = name;
    this.numCars = num;
    this.cars = new ArrayList<Car>(1000);
  }

  CarDealer() {
    this("", 0);
  }
}

class TestDealerCar {

  public static void main(String[] args) {
    CarDealer obj1 = new CarDealer();
    Car o1 = new Car("Mercedes-Benz ", "A-Class Sedan", 2021, 37800.00);
    Car o2 = new Car("Volkswagen", "Jetta", 2014, 6000.00);
    Car o3 = new Car("Jeep", "Wrangler", 2006, 4000.00);
    obj1.AddCar(o1);
    obj1.AddCar(o2);
    obj1.AddCar(o3);  
    List<Car> o = obj1.getCar();
    for (int i = 0; i < o.size(); i++) {
      System.out.println("Make - " + o.get(i).getMake());
      System.out.println("Model - " + o.get(i).getModel());
      System.out.println("Year - " + o.get(i).getYear());
      System.out.println("Price - " + o.get(i).getPrice() + "\n");
    }
  }
}
