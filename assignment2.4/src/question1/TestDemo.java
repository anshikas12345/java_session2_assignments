package question1;

import java.util.Scanner;
public class TestDemo {
public static void main(String[] args) {
	int num;
	char num1 ;
	System.out.println("enter any number: ");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	if(num > 0){
		System.out.println("YOU HAVE ENTERED POSITIVE VALUE");
		
		num1 = (char)num;
		System.out.println("ASCII value : " + num1);
	}
	else if(num < 0){
		System.out.println("YOU HAVE ENTERED NEGATIVE VALUE");
		num1 = (char)num;
		System.out.println("ASCII value : " + num1);
	}
	else {
		System.out.println("YOU ENTERED ZERO");
		num1 = (char)num;
		System.out.println("ASCII value : " + num1);
	}
}
}
