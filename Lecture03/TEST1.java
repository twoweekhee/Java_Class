package Lecture03;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subject = {"국어", "영어", "수학"};
		String[][] name = new String[7][1];
		double[][] table = new double[7][7];
		
		int i;
		int j;
		double sum = 0;
		
		for (i = 0; i <5; i++) {
			System.out.print("학생의 이름을 입력하세요 : ");
			name[i][0] = scan.nextLine();
			for (j=0; j<3; j++) {
			System.out.print("학생의 " + subject[j]+ " 성적을 입력하세요 : ");	
			table[i][j] = scan.nextDouble();
			scan.nextLine();
			sum += table[i][j];
			}
			table[i][3] = sum;
			table[i][4] = sum/3;
			sum = 0;
		}
		
		name[5][0]= "sum";
		name[6][0]= "average";
		
		for(i=0; i<3;i++) {
			sum = 0;
			for(j=0; j<5; j++) {
				sum += table[j][i];
			}
			table[5][i] = sum;
			table[6][i] = sum/5;
		}
		
		
		for (i = 0; i < 7; i++) {
				System.out.print(name[i][0]);
				System.out.print(" | ");
			for (j=0; j<5; j++) {
				System.out.print(table[i][j]);
				System.out.print("|");
			}
			System.out.print("\n");
		}
		

		scan.close();
	}
}