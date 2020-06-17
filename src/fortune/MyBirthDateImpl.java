package fortune;

public class MyBirthDateImpl implements MyBirthDate {

	private String day;
	private static String[] first = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	private static String[] second = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

	public MyBirthDateImpl() {
	}

	public MyBirthDateImpl(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	@Override
	public int õ��() {
		// �ε��� ��ȯ
		int i;
		for (i = 0; i < first.length; i++) {
			if (day.startsWith(first[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int ����() {
		// �ε��� ��ȯ
		int i;
		for (i = 0; i < second.length; i++) {
			if (day.contains(second[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String õ������(int idx) {
		// õ��()�Լ��� ������ ������ ��ȯ
		if (idx < 0) {
			System.out.println("��� ����");
			return null;
		} else {
			if (idx % 2 == 0) {
				return "��";
			} else {
				return "��";
			}
		}
	}

	@Override
	public String ��������(int idx) {
		// ����()�Լ��� ������ ������ ��ȯ
		if (idx < 0) {
			System.out.println("��� ����");
			return null;
		} else {
			if (idx % 2 == 0) {
				return "��";
			} else {
				return "��";
			}
		}
	}

	@Override
	public String õ������(int idx) {
		// õ��()�Լ��� ���� ��ȯ
		if (idx >= 0) {
			switch (idx / 2) {
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
		}
		return null;
	}

	@Override
	public String ��������(int idx) {
		// ����()�Լ��� ���� ��ȯ
		if (idx >= 0) {
			if ((idx + 1) % 3 == 0) {
				return "��";
			} else {
				switch ((idx + 1) / 3) {
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
		}
		return null;
	}

	@Override
	public String toString() {
		return "��[" + day + ", " + õ������(õ��()) + ��������(����()) + ", " + õ������(õ��()) + ��������(����()) + "]";
	}

}
