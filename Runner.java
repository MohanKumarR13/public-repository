
public class Runner {
		public static void main(String[] args) {
			
			Parent parent=new Parent() {
				public void salary() {
					System.out.println("Salary");
				}
			};
			parent.education();
			parent.work();
			parent.salary();
			Parent child =new Parent();
			child.salary();
		}
		
}
