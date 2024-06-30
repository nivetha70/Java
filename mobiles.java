package javaprogram;
import java.util.Scanner;
public class mobiles {
 String passorfail(int num) {
	if(num>40) {
		return "pass";
	}else{
		return "fail";
	}
 }
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 int num = scanner.nextInt();
	 mobiles ob1 = new mobiles();
	String result = ob1.passorfail(num);
	System.out.println(result);
 }
 }
