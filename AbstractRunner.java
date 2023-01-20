package Abstract;

public class AbstractRunner {
   public static void main(String[] args) {
	Abstract obj=new Abstract() {

		@Override
		public void salary() {
			System.out.println("Salary");
			
		}
	};
	obj.education();
	obj.work();
	obj.salary();
}
}
