package fortune;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Year year = new Year(Calendar.getInstance().get(Calendar.YEAR));
		// 현재 날짜의 연도를 가져올 수 있는 인터페이스 소환!

		Scanner sc = new Scanner(System.in); // 내가 태어난 날은 직접 입력하기
		System.out.print("내가 태어난 \"일의 이름\"을 입력하세요>>");
		MyBirthDate mbd = new MyBirthDateImpl(sc.next());

		Fortune h = new Fortune(year, mbd);
		System.out.println(h);
		h.십신풀이(h.십신());

		sc.close();
	}

}
