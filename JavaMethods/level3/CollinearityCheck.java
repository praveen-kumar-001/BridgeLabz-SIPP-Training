package JavaMethods.level3;

import java.util.Scanner;

public class CollinearityCheck {

    public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + 
                             x2 * (y3 - y1) + 
                             x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of 3 points (x1 y1 x2 y2 x3 y3):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeResult = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);

        boolean areaResult = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        if (slopeResult) {
            System.out.println("\nUsing Slope Formula: Collinear");
        } else {
            System.out.println("\nUsing Slope Formula: Not Collinear");
        }

        if (areaResult) {
            System.out.println("Using Area Formula: Collinear");
        } else {
            System.out.println("Using Area Formula: Not Collinear");
        }

    }
}

