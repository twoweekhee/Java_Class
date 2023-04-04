package lecture02;

import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("5개의 문자를 콤마로 구분하여 입력하세요.");
		String[] arr;
		String data = scan.next();
		arr = data.split(",");
		
		int i;
		
		for (i = 0; i < 5; i++) {
			if(arr[i].contains("java")) {
				System.out.println(arr[i].contains("java"));
				arr[i]= arr[i].replace("java","python");
				System.out.println(arr[i]);
			}else {
				System.out.println(arr[i].contains("java"));
				System.out.println(arr[i]);
			}
		}
				
	scan.close();	
	}
}