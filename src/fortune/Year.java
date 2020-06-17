package fortune;

public class Year {

	private int year;
	private static String[] first = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	private static String[] second = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

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

	public String ���ʰ���() {
		return first[year % 10] + second[year % 12];
	}

	public String õ������() {
		if ((year % 10) % 2 == 0) {
			return "��";
		} else {
			return "��";
		}
	}

	public String ��������() {
		if ((year % 12) % 2 == 0) {
			return "��";
		} else {
			return "��";
		}
	}

	public String õ������() {
		int y = year % 10;
		switch (y / 2) {
		case 0:
			return "��";
		case 1:
			return "��";
		case 2:
			return "��";
		case 3:
			return "ȭ";
		case 4:
			return "��";
		}
		return null;
	}

	public String ��������() {
		int y = year % 12;
		if ((y + 1) % 3 == 0) {
			return "��";
		} else {
			switch ((y + 1) / 3) {
			case 0:
				return "��";
			case 1:
				return "��";
			case 2:
				return "��";
			case 3:
				return "ȭ";
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "[" + year + ": " + ���ʰ���() + "��, " + õ������() + ��������() + ", " + õ������() + ��������() + "]";
	}

}
