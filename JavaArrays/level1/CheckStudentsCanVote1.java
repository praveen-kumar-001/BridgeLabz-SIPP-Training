package JavaArrays.level1;
import java.util.*;
public class CheckStudentsCanVote1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>=18) {
				System.out.println("The student with the age "+arr[i]+" can vote");
			}else {
				System.out.println("The student with the age "+arr[i]+" cannot vote");
			}
		}
	}

}
