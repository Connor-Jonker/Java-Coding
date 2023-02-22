public class ComparableRectangle extends Rectangle implements

Comparable<GeometricObject> {
public ComparableRectangle(double length, double width) {
super(length, width);
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