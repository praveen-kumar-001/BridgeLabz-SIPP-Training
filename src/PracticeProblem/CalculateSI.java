package PracticeProblem;
import java.util.*;
public class CalculateSI {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println("Simple Interest = "+((principal * rate * time) / 100));
    }
}
