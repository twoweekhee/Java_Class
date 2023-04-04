package part1.lecture01;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원 중심 x 입력하세요:");
		int x = scan.nextInt();
		System.out.println(x);
		
		System.out.print("원 중심 y 입력하세요:");
		int y = scan.nextInt();
		System.out.println(y);
		
		System.out.print("반지름 입력하세요:");
		int r = scan.nextInt();
		System.out.println(r);
	
		
		System.out.print("포인트 a 입력하세요:");
		int a = scan.nextInt();
		System.out.println(a);
		
		System.out.print("포인트 b 입력하세요:");
		int b = scan.nextInt();
		System.out.println(b);
		
	if ((x-a)*(x-a) + (y-b)*(y-b) <= r*r) {
		System.out.println("This is in the circle");
	}
	else {
		System.out.println("This is not in the circle");
	}
		
		scan.close();


	}

}
