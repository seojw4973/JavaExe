package ch09.abstract11;

// 일용직 사원
public class PartTimeEmployee extends Employee {
	
	protected int daliyPay;			// 일당
	protected int workDay;			// 일한 일수

	public PartTimeEmployee(String empno, String name,
						int daliyPay, int workDay) {
		super(empno, name);
		this.daliyPay = daliyPay;
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = daliyPay * workDay;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("일당 : " + daliyPay);
		System.out.println("일한 일수 : " + workDay);
		System.out.printf("월급 : %.2f \n", getMonthPay());
	}
	

}
