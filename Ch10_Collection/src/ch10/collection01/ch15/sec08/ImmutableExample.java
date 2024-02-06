package ch10.collection01.ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 수정할 수 없는 컬렉션을 생성하는 다양한 방법
public class ImmutableExample {
	public static void main(String[] args) {
		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
		// immutableList1.add("D"); --> 불변 컬렉션이므로 불가능
		
		// Set 불변 컬렉션 생성
		Set<String> ummutableList1 = Set.of("A", "B", "C");
		// immutableList1.remove("A"); --> 불변 컬렉션이므로 불가능
		
		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		// immutableList1.put(4, "D"); --> 불변 컬렉션이므로 불가능
		
		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
	}
}
