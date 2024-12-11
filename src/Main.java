import java.util.Scanner;

public class Main {

    public static double calcLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("Program on Master Branch");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 of first line: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 of first line: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2 of first line: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 of first line: ");
        int y2 = sc.nextInt();

        double len1 = calcLength(x1, y1, x2, y2);

        System.out.print("Enter x1 of second line: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y1 of second line: ");
        int y3 = sc.nextInt();

        System.out.print("Enter x2 of second line: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y2 of second line: ");
        int y4 = sc.nextInt();

        double len2 = calcLength(x3, y3, x4, y4);

        System.out.println("Length of first line: " + len1);
        System.out.println("Length of second line: " + len2);

        if (Double.compare(len1, len2) == 0) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }

        sc.close();
    }
}
