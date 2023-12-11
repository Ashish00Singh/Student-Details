package student_details;

public class Student_Data_Control {

	private Student_Details model;
	private Student_View view;

public Student_Data_Control(Student_Details model, Student_View view) {
	this.model=model;
	this.view=view;
}
	public void setStudent_ROll(Integer Student_Roll) {
		model.setStudent_Roll(Student_Roll);
	}
	public Integer getStudent_Roll() {
		return model.getStudent_Roll();	
	}
	
	public void setStudent_Name(String Student_Name) {
		model.setStudent_Name(Student_Name);
	}
	public String getStudent_Name() {
		return model.getStudent_Name();	
	}
	
	public void setStudent_Father_name(String Student_Father_name) {
		model.setStudent_Name(Student_Father_name);
	}
	public String getStudent_Father_name() {
		return model.getStudent_Father_name();	
	}
	
	public void setStudent_Exam_Id(Integer Student_Exam_Id) {
		model.setStudent_Exam_Id(Student_Exam_Id);
	}
	public Integer getStudent_Exam_Id() {
		return model.getStudent_Exam_Id();	
	}
	public void UpdateView() {
		view.StuddentDetail(model.getStudent_Exam_Id(), model.getStudent_Name(), model.getStudent_Father_name(), model.getStudent_Exam_Id());
	}
	
	
}
