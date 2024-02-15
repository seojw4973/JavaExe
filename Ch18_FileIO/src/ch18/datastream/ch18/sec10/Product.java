package ch18.datastream.ch18.sec10;

import java.io.Serializable;

// serialVersionUID는 직렬화를 할때 사용
// serialVersionUID 값을 명시적으로 지정하지 않으면
// 컴파일러가 계산한 값을 부여하는데 Serializable Class 또는 Outer 클래스에 변경이 있으면
// serialVersionUID 값이 바뀌게 되고, Serialize 할때와 DeSerialize 할때의 UID 값이 달라져 저장된 값을 객체로 복원할 수 없게 된다.
public class Product implements Serializable {
	private static final long serialVersionUID = -621812868470078544L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {return name + ": " + price;}
	
}
