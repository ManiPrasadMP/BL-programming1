package objectOriented;

public class MyDate {

	int day, month, year;

	MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	boolean isValid() {
		if (month < 1 || month > 12 || day < 1)
			return false;
		int[] days = { 31, isLeap() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return day <= days[month - 1];
	}

	void incrementDay() {
		int[] days = { 31, isLeap() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		day++;
		if (day > days[month - 1]) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}
	}

	boolean isLeap() {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	String format() {
		return String.format("%02d-%02d-%04d", day, month, year);
	}
}
