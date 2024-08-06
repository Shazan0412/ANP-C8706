package student8706_crud.Demo;

public class Student {
		private int student_Id ;
		private int student_Name ;
		private int student_Marks ;
		
		
		public Student(int student_Id, int student_Name, int student_Marks) {
			super();
			this.student_Id = student_Id;
			this.student_Name = student_Name;
			this.student_Marks = student_Marks;
		}
		
		
		
		public Student() {
			super();
		}
		
		
		public int getStudent_Id() {
			return student_Id;
		}
		public void setStudent_Id(int student_Id) {
			this.student_Id = student_Id;
		}
		public int getStudent_Name() {
			return student_Name;
		}
		public void setStudent_Name(int student_Name) {
			this.student_Name = student_Name;
		}
		public int getStudent_Marks() {
			return student_Marks;
		}
		public void setStudent_Marks(int student_Marks) {
			this.student_Marks = student_Marks;
		}
		
		
		@Override
		public String toString() {
			return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_Marks="
					+ student_Marks + "]";
		}
		
}
