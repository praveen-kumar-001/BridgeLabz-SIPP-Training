
package ControlFlows.level1;
import java.util.*;
public class CheckIfFirstIsSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		boolean result = false;
		if(num1 < num2 && num1 < num3) {
			result = true;
			System.out.println(result);
		}else {
			System.out.println(result);
		}
	}

}
