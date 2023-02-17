package Expression;

public class CalculateRunner {
	public void usingClassicalway() {
		Calculate calculate=new CalculatorImpl();
		System.out.println(calculate.add(1, 2));
	}
	public void usingInnerClass() {
		Calculate calculate=new Calculate() {
			
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		System.out.println(calculate.add(1, 2));
	}
	public void usingLamda() {
		Calculate cal=(int val1,int val2)->{return val1+val2;};
		Calculate cal1=( val1, val2)-> val1+val2;
		System.out.println(cal.add(1, 2));
		System.out.println(cal1.add(1, 2));
	}
public static void main(String[] args) {
	CalculateRunner calculateRunner=new CalculateRunner();
	calculateRunner.usingClassicalway();
	calculateRunner.usingInnerClass();
	calculateRunner.usingLamda();
}
}
