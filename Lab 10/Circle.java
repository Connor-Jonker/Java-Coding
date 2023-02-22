public class Circle extends GeometricObject {

private double radius;
public Circle(double radius) {
super();
this.radius = radius;
}
public double getRadius() {
return radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public double getArea() {
return Math.PI * radius * radius;
}
@Override
public String toString() {
return "Cirlce [radius=" + radius + "]";
}
}