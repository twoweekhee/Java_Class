package Lecture03;

import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("피라미드의 층을 입력하세요 : ");
		int layer = scan.nextInt();
		
		for (int i = 0; i < layer; i++) {
			int value = layer;
			for(int j=0; j<layer-i; j++) {
				System.out.print(" ");
			}
			for(int z=0; z<2*i+1; z++) {
				if(z==0)
					value=i;
				System.out.print(value);
				if(z>=(2*i+1)/2)
					value++;
				else
					value--;
			}
			System.out.print("\n");
		}
		
		
		scan.close();
	}
	}
		
		
		