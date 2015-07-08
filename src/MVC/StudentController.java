package MVC;

public class StudentController {

	private StudentModel model;
	private StudentView view;
	
	//constructor needed it
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void setStudentNameController (String name){
		model.setName(name);
	}
	
	public String getStudentNameController (){
		return model.getName();
	}
	
	
	//update view
	public void updateView(){
		view.PrintStudentDetails(model.getName());
	}
}
