package ch09.Resolve07.answer04;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int concatLength = s1.length + s2.length;
		int [] concat = new int[concatLength];
//		System.arraycopy(s1,0,concat,0,s1.length);
//		System.arraycopy(s2,0,concat,s1.length, s2.length);
		int cnt =0;
		for(int i=0;i<s1.length;i++) {
			concat[i] = s1[i];
			cnt++;
		}
		for(int i=0;i<s2.length;i++) {
			concat[cnt] = s2[i];
			cnt++;
		}
		return concat;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		// 일단 s1과 s2간의 겹치는 데이터가 없다고 가정하고 최대 s1의 길이만큼 배열 할당
		int [] remove = new int[s1.length];
		boolean isExist = false;		// s1의 i위치 값이 s2에 존재하는지 판단
		int idx=0;						// s1의 i위치 값이 s2에 존재하지 않을 때 intArr에 저장할 위치
										
		
		// s1의 값을 1개씩 s2에 있는지 확인하기 위해서
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				// s1의 i위치값이 s2전체 중에 존재하는 지 판단				
				if(s1[i]==s2[j]) {
					// 존재한다면 for(int j~)를 탈출
					isExist = true;
					break;
				}
			}
			// 찾지 못했으면 isExist는 false => 새로운 remove의 idx위치에 저장
			if(isExist==false) {
				remove[idx] = s1[i];
				idx++;
			}
			// 다시 s1의 다음 위치 i를 검색해야하므로 isExist를 false로 지정
			isExist = false;
		}
		/*중복은 제거되었지만 불필요한 배열의 공간이 남을 수 있으므로 새로 할당*/
		int [] newRemoveArray = new int[idx];
		for(int i = 0; i<idx;i++) {
			newRemoveArray[i] = remove[i];
	
		
//		int arrayIndex =  s1.length;
//		int cnt = 0;
//		int [] remove = new int[s1.length];
//		for(int i = 0; i<s1.length;i++) {
//			for(int j = 0; j < s2.length;j++) {
//				if(s1[i] == s2[j]) {
//					arrayIndex--;
//					break;
//				}else if(j==s2.length -1) {
//					remove[cnt] = s1[i];
//					cnt++;
//				}
		
//		return remove;
		
		}
		return newRemoveArray;
	}
}
	
//	public static void main(String[] args) {
//		int [] s1 = {1, 2, 3, 4, 8};
//		int [] s2 = {3, 4, 5, 6, 7};
//		
//		int [] newConcat = new int[s1.length+s2.length];
//		int [] newRemove = new int[s1.length];
//		
//		newConcat = ArrayUtility2.concat(s1, s2);
//		newRemove = ArrayUtility2.remove(s1, s2);
//		
//		// 배열을 출력해야하는데 배열 안의 숫자가 출력되는 상태이므로 수정 요망
//		System.out.println("s1과 s2를 연결한 새로운 배열");
//		for(int i = 0; i<s1.length+s2.length;i++) {
//			System.out.print(Arrays.toString(newConcat));
//		}
//		System.out.println();
//		
//		System.out.println("s1에서 s2와 중복되는 숫자 제거");
//		for(int i = 0; i<ArrayUtility2.remove(s1, s2).length;i++) {
//			System.out.print(Arrays.toString(newRemove));
//		}
//		
//		
//	}
//}
