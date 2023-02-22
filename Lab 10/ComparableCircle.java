public class ComparableCircle extends Circle implements

Comparable<GeometricObject> {
public ComparableCircle(double radius) {
super(radius);
}
@Override
public int compareTo(GeometricObject o) {
int val = 0;
double area = o.getArea();
if (getArea() > area)
val = 1;
else if (getArea() < area)
val = -1;
else if (getArea() == area)
val = 0;
return val;
}
}