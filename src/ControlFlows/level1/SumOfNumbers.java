package ControlFlows.level1;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			sum += n;
		}
		System.out.println(sum);
		

	}

}
