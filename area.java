import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        radius = scanner.nextDouble();

       
        scanner.close();
                                                                                      
       
        area = calculateCircleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

   
    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
