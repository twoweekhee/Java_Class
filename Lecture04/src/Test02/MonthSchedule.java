package Test02;

import java.util.Scanner;

public class MonthSchedule {
	Day[] datearr;
	int datearrlength;
	
	MonthSchedule(int datearrlength){
		this.datearrlength = datearrlength;
		this.datearr = new Day[datearrlength];
		for(int i = 0; i < datearrlength; i++) {
			datearr[i] = new Day();
		}
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Date(1-"+ datearrlength+")");
		int date = scan.nextInt();
		System.out.println("Do list(without space)?");
		datearr[date - 1].set(scan.next());
		//scan.close();
	}
	void view() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Date(1-"+ datearrlength +")");
		int date = scan.nextInt();
		System.out.println("There is ["+ datearr[date-1].work +"]on the"+ date);
		//scan.close();
	}
	void finish() {
		System.out.println("This is the end of the program");
	}
	
	void run() {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Command(Insert:1, Show:2, Quit:3 >>");
		int num = scan.nextInt();

		if (num == 1) {
			input();

		} else if (num == 2) {
			view();
			
		} else if (num == 3) {
			finish();
			break;
		}
		
		
		
		//scan.close();
		}
		
	}
	

}
