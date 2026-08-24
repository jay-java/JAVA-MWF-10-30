package core;

import java.util.Scanner;

class Demo {
	public void call() {
		System.out.println("call method in demo class");
	}
}

public class P005_UserInput {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.call();
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter num = ");
		num = sc.nextInt();
		System.out.println(num);

		System.out.println("enter double  = ");
		double d = sc.nextDouble();
		System.out.println(d);
	}
}
