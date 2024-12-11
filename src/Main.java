// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation");

        System.out.print("Enter x1 of first line: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 of first line: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2 of first line: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 of first line: ");
        int y2 = sc.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Line line1 = new Line(p1, p2);

        System.out.print("Enter x1 of second line: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y1 of second line: ");
        int y3 = sc.nextInt();

        System.out.print("Enter x2 of second line: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y2 of second line: ");
        int y4 = sc.nextInt();

        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of first line: " + line1.getLength());
        System.out.println("Length of second line: " + line2.getLength());

        if (line1.getLength() == line2.getLength()) {
            System.out.println("The lines are equal.");
        } else if (line1.getLength() > line2.getLength()) {
            System.out.println("The first line is greater.");
        } else {
            System.out.println("The second line is greater.");
        }

        sc.close();
    }
}
