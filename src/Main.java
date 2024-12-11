import java.util.Scanner;

public class Main {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("Program on Master Branch");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the y-coordinate of the first point: ");
        int y1 = scanner.nextInt();

        System.out.print("Enter the x-coordinate of the second point: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the y-coordinate of the second point: ");
        int y2 = scanner.nextInt();

        double length = calculateLength(x1, y1, x2, y2);

        System.out.println("The length of the line between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + length);

        scanner.close();
    }
}
