package part1.lecture01;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("50000는 몇개 인가:");
		int x = scan.nextInt();
		System.out.println(x);
		
		System.out.print("10000는 몇개 인가 :");
		int y = scan.nextInt();
		System.out.println(y);
		
		System.out.print("1000은 몇개 인가 : ");
		int z = scan.nextInt();
		System.out.println(z);
		
		System.out.print("500은 몇개 인가 : ");
		int a = scan.nextInt();
		System.out.println(a);
		
		System.out.print("10은 몇개 인가 : ");
		int b = scan.nextInt();
		System.out.println(b);
		
		System.out.print("1은 몇개 인가 : ");
		int c = scan.nextInt();
		System.out.println(c);
		
	
		System.out.print(50000*x + 10000*y + 1000*z + 500*a + 10*b + 1*c + "won");

		scan.close();

	}

}
