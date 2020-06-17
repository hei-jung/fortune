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

	public String 극생판별(String str1, String str2) {
		if (str1.equals("목")) {
			if (str2.equals("토")) {
				return "극";
			} else if (str2.equals("화")) {
				return "생";
			}
		} else if (str1.equals("화")) {
			if (str2.equals("금")) {
				return "극";
			} else if (str2.equals("토")) {
				return "생";
			}
		} else if (str1.equals("토")) {
			if (str2.equals("수")) {
				return "극";
			} else if (str2.equals("금")) {
				return "생";
			}
		} else if (str1.equals("금")) {
			if (str2.equals("목")) {
				return "극";
			} else if (str2.equals("수")) {
				return "생";
			}
		} else if (str1.equals("수")) {
			if (str2.equals("화")) {
				return "극";
			} else if (str2.equals("목")) {
				return "생";
			}
		}
		return null;
	}

	public String 천갑극생() {
		String str1 = year.천갑오행();
		String str2 = mbd.천갑오행(mbd.천갑());
		String h = 극생판별(str1, str2);
		if (h != null) {
			return h;
		} else {
			return 극생판별(str2, str1);
		}
	}

	public String 지지극생() {
		String str1 = year.지지오행();
		String str2 = mbd.천갑오행(mbd.천갑());
		String h = 극생판별(str1, str2);
		if (h != null) {
			return h;
		} else {
			return 극생판별(str2, str1);
		}
	}

	public String 극생() {
		return 천갑극생() + 지지극생();
	}

	public String 십신판별(String yearFE) {
		String myFE = mbd.천갑오행(mbd.천갑());
		String myYY = mbd.천갑음양(mbd.천갑());
		String yearYY = year.천갑음양();
		String str = null;
		if (myFE.equals(yearFE)) {
			// 나와 오행이 같고
			if (myYY.equals(yearYY)) {
				// 음양이 같은 것
				str = "비견";
			} else {
				// 음양이 다른 것
				str = "겁재";
			}
		} else if (극생판별(myFE, yearFE) != null) {
			if (극생판별(myFE, yearFE) == "생") {
				// 내가 생하고
				if (myYY.equals(yearYY)) {
					// 음양이 같은 것
					str = "식신";
				} else {
					// 음양이 다른 것
					str = "상관";
				}
			} else if (극생판별(myFE, yearFE) == "극") {
				// 내가 극하고
				if (myYY.equals(yearYY)) {
					// 음양이 같은 것
					str = "편재";
				} else {
					// 음양이 다른 것
					str = "정재";
				}
			}
		} else {
			if (극생판별(yearFE, myFE) == "극") {
				// 나를 극하고
				if (myYY.equals(yearYY)) {
					// 음양이 같은 것
					str = "편관";
				} else {
					// 음양이 다른 것
					str = "정관";
				}
			} else if (극생판별(yearFE, myFE) == "생") {
				// 나를 생하고
				if (myYY.equals(yearYY)) {
					// 음양이 같은 것
					str = "편인";
				} else {
					// 음양이 다른 것
					str = "정인";
				}
			}
		}
		return str;
	}

	public String 십신() {
		String yearFE1 = year.천갑오행();
		String yearFE2 = year.지지오행();
		return 십신판별(yearFE1) + ", " + 십신판별(yearFE2);
	}

	public void 십신풀이(String str) {
		if (str.contains("비견")) {
			System.out.println("비견 특성: 분리, 독립, 자존심, 고집");
		}
		if (str.contains("겁재")) {
			System.out.println("겁재 특성: 투쟁과 독단, 교만. 강자에게 아부하는 비굴함");
		}
		if (str.contains("식신")) {
			System.out.println("식신 특성: 의식주, 일복");
		}
		if (str.contains("상관")) {
			System.out.println("상관 특성: 교만하고 타인을 얕봄. 강자에게 아부하는 경향 있음");
		}
		if (str.contains("편재")) {
			System.out.println("편재 특성: 고집, 강직. 재물의 들고 나감이 심함");
		}
		if (str.contains("정재")) {
			System.out.println("정재 특성: 다복한 생활, 안정감 있는 생활");
		}
		if (str.contains("편관")) {
			System.out.println("편관 특성: 완강, 고집, 흉폭. 자기주장만 내세우며 다른 사람을 무시하는 경향 있음");
		}
		if (str.contains("정관")) {
			System.out.println("정관 특성: 품행이 단정하고 명예와 신용을 지킴");
		}
		if (str.contains("편인")) {
			System.out.println("편인 특성: 이별, 고독, 파산. 불행해짐");
		}
		if (str.contains("정인")) {
			System.out.println("정인 특성: 지혜롭고 단정함. 타인에게 존경받음");
		}
		// https://sajuplus.tistory.com/389 참고
	}

	@Override
	public String toString() {
		return "[올해=" + year + ", 나=" + mbd + ", 십신=" + 십신() + "]";
	}

}
