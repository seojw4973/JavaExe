package ch17.stream01;

import java.util.ArrayList;
import java.util.List;

/* [스트림의 특징]
 * 1) 자료의 대상과 관계없이 동일한 연산을 수행
 *	  (사용 방법을 일관되게)
 * 2) 한 번 생성하고 사용한 스트림은 재사용할 수 없다.
 *
 * */

public class StreamSort {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Tomas");
		nameList.add("Edward");
		nameList.add("Jack");
		
		nameList.stream().sorted().forEach(s -> System.out.print(s + " "));
	}
}
