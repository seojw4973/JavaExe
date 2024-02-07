package ch10.collection02.hashmap02;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체정보보기");
//System.out.println("5. 종료");
public interface EmpMenu {
// 인터페이스에서는 public을 붙이지 않아도 자동으로 public으로 취급
	int REG_EMP = 1;
	int TEMP_EMP = 2;
	int PART_EMP = 3;
	int ALL_INFO = 4;
	int REG_INFO = 5;
	int TEMP_INFO = 6;
	int PART_INFO = 7;
	int EXIT = 8;
}
