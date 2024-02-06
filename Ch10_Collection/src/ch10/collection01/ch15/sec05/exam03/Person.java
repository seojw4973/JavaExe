package ch10.collection01.ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//	@Override 		나이를 비교하여 정렬
//	public int compareTo(Person o) {
//		if(age<o.age) return -1;		//<,>에 따라 오름차순, 내림차순으로 정렬 가능
//		else if(age == o.age) return 0;
//		else return 1;
//	}
	@Override	// 이름을 비교하여 정렬
	public int compareTo(Person o) {
		return name.compareTo(o.name);
//		return name.compareTo(o.name)*-1;  역정렬
	}
}	
