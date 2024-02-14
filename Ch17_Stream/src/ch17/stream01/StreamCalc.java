package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("톨스토이");
		nameList.add("김수한무거북이와두루미삼천갑자동방삭");
		nameList.add("Cristoper");
		nameList.add("프랑스대왕루이14세");
		nameList.add("영국알프레드대왕");
		nameList.add("영문예무인성명효대왕");
		nameList.add("일본왕");
		nameList.add("크리스티아누 호날두");
		
		for(String name : nameList) {
			if(name.length()>=5) {
				System.out.print(name + ", ");
			}
		}
		System.out.println();
		
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s->s.length()>=5);
		strmF.forEach(s->System.out.print(s + ", "));	//forEach가 실행되지 않으면 중간연산 상태에서 멈춤
		System.out.println();
		
		/* 한번 사용한 스트림은 재사용할 수 없음.
		strmF.forEach(s->System.out.print(s + ", "));	
		System.out.println();
		*/
		

		nameList.stream()					// 1) 스트림 객체
				.filter(s->s.length()>=5)	// 2) 중간 연산(참일 때 새로운 스트림)
				.filter(s->s.length()<10)
				.forEach(s->System.out.print(s + ", ")); // 최종연산
		
	}
}














