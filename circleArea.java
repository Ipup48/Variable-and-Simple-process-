import java.util.Scanner;
public class circleArea {
    public static void main(String args[]) {
        final double PI = 3.14159 ;
        System.out.print("Enter circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double circle = (PI * radius * radius);
        System.out.println ("Area of circle that has radius : " + circle +" square meters");
    }
}
