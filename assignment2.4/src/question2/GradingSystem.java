package question2;

import java.util.Scanner;
public class GradingSystem {
public static void main(String[] args) {
	double phy;
	double chem;
	double maths;
	double avgMarks;
	char grade;
	System.out.println("enter marks for physics, chemistry and maths: ");
	Scanner s = new Scanner(System.in);
	phy = s.nextDouble();
	chem = s.nextDouble();
	maths = s.nextDouble();
	avgMarks = (phy + chem + maths)/3;
	if(avgMarks > 70 && avgMarks <= 100){
		grade = 'A';
		System.out.println("your grade is : " + grade + " , with average marks = " +Math.ceil(avgMarks));
	}
	else if(avgMarks >= 61 && avgMarks <= 70){
		grade = 'B';
		System.out.println("your grade is : " + grade + " , with average marks = " +Math.ceil(avgMarks));
		
	}
	else if(avgMarks >= 0 && avgMarks < 61){
		
		grade = 'C';
		System.out.println("your grade is : " + grade + " , with average marks = " +Math.ceil(avgMarks));
		
	}
	else{
		
		System.out.println("you have negative marks!");
	}
}
}
