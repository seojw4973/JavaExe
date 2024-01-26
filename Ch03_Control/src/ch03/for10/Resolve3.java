package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
//	public static void methodIf() {
//		int edge1, edge2, edge3;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("edge1의 길이 입력");
//		edge1 = sc.nextInt();
//		System.out.println("edge2의 길이 입력");
//		edge2 = sc.nextInt();
//		System.out.println("edge3의 길이 입력");
//		edge3 = sc.nextInt();
//		
//		boolean bTriangle = false;
//		if((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1 + edge3 > edge2))
//					bTriangle = true;
//	
//		if(edge1 + edge2 > edge3) {
//			if(edge2 + edge3 > edge1) {
//				if(edge1 + edge3 > edge2)
//					bTriangle = true;
//			}
//		}
//		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
//		
//		sc.close();
//		
//	}
//	
//	
	public static void main(String[] args) {
		int edge1, edge2, edge3;
		String str1, str2, str3;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("edge1의 길이 입력");
		edge1 = sc.nextInt();
		System.out.println("edge2의 길이 입력");
		edge2 = sc.nextInt();
		System.out.println("edge3의 길이 입력");
		edge3 = sc.nextInt();
		
		boolean bTriangle = false;
		
		boolean cond0 = edge1 + edge2 > edge3;
		boolean cond1 = edge2 + edge3 > edge1;
		boolean cond2 = edge1 + edge3 > edge2;
		
		bTriangle = cond0 ? (cond1 ? (cond2 ? true : false) : false) : false;
		
		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
		
//		int num1 = edge1 + edge2;
//		int num2 = edge2 + edge3;
//		int num3 = edge1 + edge3;
//		
//		str1 = num1 > edge3 ? "삼각형이 만들어집니다." : "삼각형이 만들어지지 않습니다.";
//		System.out.println(str1);
//		str2 = num2 > edge1 ? "삼각형이 만들어집니다." : "삼각형이 만들어지지 않습니다.";
//		System.out.println(str2);
//		str3 = num3 > edge2 ? "삼각형이 만들어집니다." : "삼각형이 만들어지지 않습니다.";
//		System.out.println(str3);
		
		sc.close();
			}

}
