package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("input year");
		int y1 = in.nextInt();
		boolean  Leapyear = (y1 %4 == 0) && (y1 %100 != 0) || y1 %400 ==0;
		System.out.println (y1 + " is a leap year; " + Leapyear);
		
		
	}

}
