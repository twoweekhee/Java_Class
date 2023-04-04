package lecture02;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10개의 정수를 띄워쓰기 구분하여 입력하세요.");
		int[] arr = new int[10];
		int i;
		float sum = 0;
		float sum2 = 0;
	
		
		for (i = 0; i < 10; i++) {
				arr[i] = scan.nextInt();
				sum += arr[i];
		}
		float mean = (sum/10);
		System.out.println(mean);
		
		for (i = 0; i < 10; i++) {
			sum2 += (arr[i]-mean) * (arr[i]-mean);	
		}
		
		float variance = (sum2/10);
		System.out.print(variance);
	
		scan.close();
	}
}