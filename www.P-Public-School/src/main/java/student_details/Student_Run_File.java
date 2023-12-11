package student_details;

public class Student_Run_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Details model=retiveStudent_Details();
		Student_View view = new Student_View();
		Student_Data_Control S_D_C= new Student_Data_Control(model, view);
				S_D_C.UpdateView();
				
				S_D_C.setStudent_Exam_Id(001);
				System.out.println("------------------laas-----------");
				S_D_C.UpdateView();

	}
	private static Student_Details retiveStudent_Details() {
		Student_Details s_d=new Student_Details();
		s_d.setStudent_Roll(45);
		s_d.setStudent_Name("ola");
		s_d.setStudent_Father_name("uber");
		s_d.setStudent_Exam_Id(25);
		return s_d;
		
	}

}
