package part1.lecture01;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삼각형의 첫 번째 변의 길이를 입력하시오:");
		int x = scan.nextInt();
		System.out.println(x);
		
		System.out.print("삼각형의 두 번째 변의 길이를 입력하시오:");
		int y = scan.nextInt();
		System.out.println(y);
		
		System.out.print("삼각형의 세 번째 변의 길이를 입력하시오:");
		int z = scan.nextInt();
		System.out.println(z);
		
	
		if ((x+y)>z & (x+z)>y & (y+z)>x) {
			System.out.println("This is triangle");
		}
		else {
			System.out.println("This is not triangle");
		}
			
		scan.close();

	}

}
