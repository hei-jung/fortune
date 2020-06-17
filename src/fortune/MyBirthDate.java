package fortune;

public interface MyBirthDate {

	public int 천갑();// 인덱스 반환

	public int 지지();// 인덱스 반환

	public String 천갑음양(int idx);// 천갑()함수로 양인지 음인지 반환

	public String 지지음양(int idx);// 지지()함수로 양인지 음인지 반환

	public String 천갑오행(int idx);// 천갑()함수로 오행 반환

	public String 지지오행(int idx);// 지지()함수로 오행 반환
}
