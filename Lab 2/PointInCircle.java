import java.util.*; 

public class PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float radius = sc.nextFloat();  //read the value from the input.
        // sets the values where the random values are generated
        float minRange = -radius;
        float maxRange = radius;
        // generates a random value for the x coordinates
        double pointX = Math.random() * (maxRange - minRange  ) + minRange;
        // rounds to two decimal place
        pointX = Math.round(pointX * 100.0) / 100.0;
        // generates a random value for the y coordinates
        double pointY = Math.random() * (maxRange - minRange  ) + minRange;
        // rounds to two decimal place
        pointY = Math.round(pointY * 100.0) / 100.0;
        // finds distance between origin and generated point
        double distance = Math.sqrt((pointX * pointX) + (pointY * pointY));
        if(distance < radius) {
            // if the point is inside the circle
            System.out.println("Point("+pointX+", "+pointY+" ) is in the circle");
        }
        else {
            // if the point is not inside the circle
            System.out.println("Point("+pointX+", "+pointY+" ) is not in the circle");
        }
        // System.out.println(distance);
    }
}