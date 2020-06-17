package fortune;

public class Fortune {

	private Year year;
	private MyBirthDate mbd;

	public Fortune() {
	}

	public Fortune(Year year, MyBirthDate mbd) {
		this.year = year;
		this.mbd = mbd;
	}

	public String �ػ��Ǻ�(String str1, String str2) {
		if (str1.equals("��")) {
			if (str2.equals("��")) {
				return "��";
			} else if (str2.equals("ȭ")) {
				return "��";
			}
		} else if (str1.equals("ȭ")) {
			if (str2.equals("��")) {
				return "��";
			} else if (str2.equals("��")) {
				return "��";
			}
		} else if (str1.equals("��")) {
			if (str2.equals("��")) {
				return "��";
			} else if (str2.equals("��")) {
				return "��";
			}
		} else if (str1.equals("��")) {
			if (str2.equals("��")) {
				return "��";
			} else if (str2.equals("��")) {
				return "��";
			}
		} else if (str1.equals("��")) {
			if (str2.equals("ȭ")) {
				return "��";
			} else if (str2.equals("��")) {
				return "��";
			}
		}
		return null;
	}

	public String õ���ػ�() {
		String str1 = year.õ������();
		String str2 = mbd.õ������(mbd.õ��());
		String h = �ػ��Ǻ�(str1, str2);
		if (h != null) {
			return h;
		} else {
			return �ػ��Ǻ�(str2, str1);
		}
	}

	public String �����ػ�() {
		String str1 = year.��������();
		String str2 = mbd.õ������(mbd.õ��());
		String h = �ػ��Ǻ�(str1, str2);
		if (h != null) {
			return h;
		} else {
			return �ػ��Ǻ�(str2, str1);
		}
	}

	public String �ػ�() {
		return õ���ػ�() + �����ػ�();
	}

	public String �ʽ��Ǻ�(String yearFE) {
		String myFE = mbd.õ������(mbd.õ��());
		String myYY = mbd.õ������(mbd.õ��());
		String yearYY = year.õ������();
		String str = null;
		if (myFE.equals(yearFE)) {
			// ���� ������ ����
			if (myYY.equals(yearYY)) {
				// ������ ���� ��
				str = "���";
			} else {
				// ������ �ٸ� ��
				str = "����";
			}
		} else if (�ػ��Ǻ�(myFE, yearFE) != null) {
			if (�ػ��Ǻ�(myFE, yearFE) == "��") {
				// ���� ���ϰ�
				if (myYY.equals(yearYY)) {
					// ������ ���� ��
					str = "�Ľ�";
				} else {
					// ������ �ٸ� ��
					str = "���";
				}
			} else if (�ػ��Ǻ�(myFE, yearFE) == "��") {
				// ���� ���ϰ�
				if (myYY.equals(yearYY)) {
					// ������ ���� ��
					str = "����";
				} else {
					// ������ �ٸ� ��
					str = "����";
				}
			}
		} else {
			if (�ػ��Ǻ�(yearFE, myFE) == "��") {
				// ���� ���ϰ�
				if (myYY.equals(yearYY)) {
					// ������ ���� ��
					str = "���";
				} else {
					// ������ �ٸ� ��
					str = "����";
				}
			} else if (�ػ��Ǻ�(yearFE, myFE) == "��") {
				// ���� ���ϰ�
				if (myYY.equals(yearYY)) {
					// ������ ���� ��
					str = "����";
				} else {
					// ������ �ٸ� ��
					str = "����";
				}
			}
		}
		return str;
	}

	public String �ʽ�() {
		String yearFE1 = year.õ������();
		String yearFE2 = year.��������();
		return �ʽ��Ǻ�(yearFE1) + ", " + �ʽ��Ǻ�(yearFE2);
	}

	public void �ʽ�Ǯ��(String str) {
		if (str.contains("���")) {
			System.out.println("��� Ư��: �и�, ����, ������, ����");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: ����� ����, ����. ���ڿ��� �ƺ��ϴ� ����");
		}
		if (str.contains("�Ľ�")) {
			System.out.println("�Ľ� Ư��: �ǽ���, �Ϻ�");
		}
		if (str.contains("���")) {
			System.out.println("��� Ư��: �����ϰ� Ÿ���� �躽. ���ڿ��� �ƺ��ϴ� ���� ����");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: ����, ����. �繰�� ��� ������ ����");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: �ٺ��� ��Ȱ, ������ �ִ� ��Ȱ");
		}
		if (str.contains("���")) {
			System.out.println("��� Ư��: �ϰ�, ����, ����. �ڱ����常 ������� �ٸ� ����� �����ϴ� ���� ����");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: ǰ���� �����ϰ� ���� �ſ��� ��Ŵ");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: �̺�, ��, �Ļ�. ��������");
		}
		if (str.contains("����")) {
			System.out.println("���� Ư��: �����Ӱ� ������. Ÿ�ο��� �������");
		}
		// https://sajuplus.tistory.com/389 ����
	}

	@Override
	public String toString() {
		return "[����=" + year + ", ��=" + mbd + ", �ʽ�=" + �ʽ�() + "]";
	}

}
