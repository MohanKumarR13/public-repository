package Expression;

public class CarRunner {

	public void classicalWay() {
		Car benz = new Benz();
		benz.start();
	}

	public void usingAnonymousInnerClass() {
		Car benz = new Car() {

			@Override
			public void start() {
				System.out.println("Benz Start From Inner Class");

			}
		};
		benz.start();
	}

	public void usingLamda() {
		Car benz = () -> System.out.println("Using Lamda");
		benz.start();
	}

	public static void main(String[] args) {
		CarRunner carRunner = new CarRunner();
		carRunner.classicalWay();
		carRunner.usingAnonymousInnerClass();
		carRunner.usingLamda();
	}
}
