package fortune;

public class Year {

	private int year;
	private static String[] first = { "경", "신", "임", "계", "갑", "을", "병", "정", "무", "기" };
	private static String[] second = { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미" };

	public Year() {

	}

	public Year(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	

	public String[] getFirst() {
		return first;
	}

	public String[] getSecond() {
		return second;
	}

	public String 육십갑자() {
		return first[year % 10] + second[year % 12];
	}

	public String 천갑음양() {
		if ((year % 10) % 2 == 0) {
			return "양";
		} else {
			return "음";
		}
	}

	public String 지지음양() {
		if ((year % 12) % 2 == 0) {
			return "양";
		} else {
			return "음";
		}
	}

	public String 천갑오행() {
		int y = year % 10;
		switch (y / 2) {
		case 0:
			return "금";
		case 1:
			return "수";
		case 2:
			return "목";
		case 3:
			return "화";
		case 4:
			return "토";
		}
		return null;
	}

	public String 지지오행() {
		int y = year % 12;
		if ((y + 1) % 3 == 0) {
			return "토";
		} else {
			switch ((y + 1) / 3) {
			case 0:
				return "금";
			case 1:
				return "수";
			case 2:
				return "목";
			case 3:
				return "화";
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "[" + year + ": " + 육십갑자() + "년, " + 천갑음양() + 지지음양() + ", " + 천갑오행() + 지지오행() + "]";
	}

}
