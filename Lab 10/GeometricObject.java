public abstract class GeometricObject {

private String color;
public GeometricObject() {
}
public GeometricObject(String color) {
this.color = color;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
@Override
public String toString() {
return " Color=" + color;
}
public abstract double getArea();
}