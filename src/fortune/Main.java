package fortune;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Year year = new Year(Calendar.getInstance().get(Calendar.YEAR));
		// ���� ��¥�� ������ ������ �� �ִ� �������̽� ��ȯ!

		Scanner sc = new Scanner(System.in); // ���� �¾ ���� ���� �Է��ϱ�
		System.out.print("���� �¾ \"���� �̸�\"�� �Է��ϼ���>>");
		MyBirthDate mbd = new MyBirthDateImpl(sc.next());

		Fortune h = new Fortune(year, mbd);
		System.out.println(h);
		h.�ʽ�Ǯ��(h.�ʽ�());

		sc.close();
	}

}
