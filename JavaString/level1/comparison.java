package JavaString.level1;
import java.util.*;
public class comparison {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String str1=sc.next();
    	String str2=sc.next();
    	boolean areequal=true;
    	if(str1.length() != str2.length()) {
    		areequal=false;
    	}
    	else {
    		for(int i=0;i<str1.length();i++) {
    			if(str1.charAt(i) != str2.length()) {
    				areequal=false;
    				break; 
    			}
    		}
    	}
    	if(areequal) {
    		System.out.println("Strings are equal");             
    	}
    	else {
    		System.out.println("Strings are not equal");
    	}
    }
}
