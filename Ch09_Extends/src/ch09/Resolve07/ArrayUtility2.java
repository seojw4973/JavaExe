package ch09.Resolve07;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int concatLength = s1.length + s2.length;
		int [] concat = new int[concatLength];
		System.arraycopy(s1,0,concat,0,s1.length);
		System.arraycopy(s2,0,concat,s1.length, s2.length);
		return concat;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		int arrayIndex =  s1.length;
		int cnt = 0;
		int [] remove = new int[s1.length];
		for(int i = 0; i<s1.length;i++) {
			for(int j = 0; j < s2.length;j++) {
				if(s1[i] == s2[j]) {
					arrayIndex--;
					break;
				}else if(j==s2.length -1) {
					remove[cnt] = s1[i];
					cnt++;
				}
			}
		}
//		return remove;
		int [] newRemoveArray = new int[arrayIndex];
		for(int i = 0; i<arrayIndex;i++) {
			newRemoveArray[i] = remove[i];
		}
		return newRemoveArray;
	}
	
	
	public static void main(String[] args) {
		int [] s1 = {1, 2, 3, 4, 8};
		int [] s2 = {3, 4, 5, 6, 7};
		
		int [] newConcat = new int[s1.length+s2.length];
		int [] newRemove = new int[s1.length];
		
		newConcat = ArrayUtility2.concat(s1, s2);
		newRemove = ArrayUtility2.remove(s1, s2);
		
		// 배열을 출력해야하는데 배열 안의 숫자가 출력되는 상태이므로 수정 요망
		System.out.println("s1과 s2를 연결한 새로운 배열");
		for(int i = 0; i<s1.length+s2.length;i++) {
			System.out.print(newConcat[i]);
		}
		System.out.println();
		
		System.out.println("s1에서 s2와 중복되는 숫자 제거");
		for(int i = 0; i<ArrayUtility2.remove(s1, s2).length;i++) {
			System.out.print(newRemove[i]);
		}
		
		
	}
}
