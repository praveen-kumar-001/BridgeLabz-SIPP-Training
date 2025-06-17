package PracticeProblem;
import java.util.*;
public class VolOfCylinder {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Volume of Cylinder = "+ (3.14*(rad*rad)*height));
        
    }
}
