public class CompareShapeAreas {

public static void main(String[] args) {

ComparableCircle cc1=new ComparableCircle(5.5);

ComparableCircle cc2=new ComparableCircle(4.5);

ComparableRectangle cr=new ComparableRectangle(4,5);

if(cc1.compareTo(cc2)==1)

{
System.out.println("Circle #1's area is greater than the area of Circle #2");
}
else if(cc1.compareTo(cc2)==-1)
{
System.out.println("Circle #2's area is larger than Circle #1's Area");
}
else
{
System.out.println("Circle #1 and Circle #2 both have the same area");
}
if(cc1.compareTo(cr)==1)
{
System.out.println("Circle #1's area is larger than the area of the rectangle");
}
else if(cc1.compareTo(cr)==-1)
{
System.out.println("The area of the rectangle is greater than the area of circle #1");
}
else
{
System.out.println("The circle and the rectangle have the same area");
}
}
}