package PracticeProblem;
import java.util.*;
public class PerimeterOfRec {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double wid = sc.nextDouble();
        System.out.println("Perimeter = "+ (2*(len+wid)));
    }
}
