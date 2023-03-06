import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
import entities.Rectangle;

public class App {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        Rectangle h1, h2;
        h1 = new Rectangle();
        h2 = new Rectangle();

        System.out.println("Calculating the area of a triangle: ");
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        System.out.println();

        System.out.println("Calculating the area of a rectangle: ");
        System.out.println("Enter the measures of rectangle X: ");
        h1.h = sc.nextDouble();
        h1.b = sc.nextDouble();
        System.out.println("Enter the measures of rectangle Y: ");
        h2.h = sc.nextDouble();
        h2.b = sc.nextDouble();
        System.out.println();

        double areaX = x.area();
        double areaY = y.area();
        double areaRec = h1.areaRectangle();
        double areaRec2 = h2.areaRectangle();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println();
        System.out.printf("Rectangle X area: %.4f%n", areaRec);
        System.out.printf("Rectangle Y area: %.4f%n", areaRec2);
        System.out.println(); 

        if (areaX > areaY) {
        System.out.println("Larger triangle area: X");
        }
        else {
        System.out.println("Larger triangle area: Y");
        }

        System.out.println();

        if (areaRec > areaRec2) {
            System.out.println("Larger rectangle area: X");
            }
            else {
            System.out.println("Larger rectangle area: Y");
            }
        sc.close();
    }
}

