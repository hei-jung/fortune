package fortune;

public class MyBirthDateImpl implements MyBirthDate {

	private String day;
	private static String[] first = { "경", "신", "임", "계", "갑", "을", "병", "정", "무", "기" };
	private static String[] second = { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미" };

	public MyBirthDateImpl() {
	}

	public MyBirthDateImpl(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	@Override
	public int 천갑() {
		// 인덱스 반환
		int i;
		for (i = 0; i < first.length; i++) {
			if (day.startsWith(first[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int 지지() {
		// 인덱스 반환
		int i;
		for (i = 0; i < second.length; i++) {
			if (day.contains(second[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String 천갑음양(int idx) {
		// 천갑()함수로 양인지 음인지 반환
		if (idx < 0) {
			System.out.println("계산 실패");
			return null;
		} else {
			if (idx % 2 == 0) {
				return "양";
			} else {
				return "음";
			}
		}
	}

	@Override
	public String 지지음양(int idx) {
		// 지지()함수로 양인지 음인지 반환
		if (idx < 0) {
			System.out.println("계산 실패");
			return null;
		} else {
			if (idx % 2 == 0) {
				return "양";
			} else {
				return "음";
			}
		}
	}

	@Override
	public String 천갑오행(int idx) {
		// 천갑()함수로 오행 반환
		if (idx >= 0) {
			switch (idx / 2) {
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
		}
		return null;
	}

	@Override
	public String 지지오행(int idx) {
		// 지지()함수로 오행 반환
		if (idx >= 0) {
			if ((idx + 1) % 3 == 0) {
				return "토";
			} else {
				switch ((idx + 1) / 3) {
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
		}
		return null;
	}

	@Override
	public String toString() {
		return "나[" + day + ", " + 천갑음양(천갑()) + 지지음양(지지()) + ", " + 천갑오행(천갑()) + 지지오행(지지()) + "]";
	}

}
