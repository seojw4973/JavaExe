package ch09.abstract10;

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
		System.out.println("daliyPay : " + daliyPay);
		System.out.println("workDay : " + workDay);
		System.out.println("monthPay : " + getMonthPay());
	}
	

}
