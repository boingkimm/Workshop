package workshop03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		//Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값과 최소값을 구하는 코드 작업. 단, if 문 사용할 것
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값: ");
		int a = scan.nextInt();
		System.out.print("b 값: ");
		int b = scan.nextInt();
		System.out.print("c 값: ");
		int c = scan.nextInt();
		
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		System.out.println("최대값: " + max);
	}

}
