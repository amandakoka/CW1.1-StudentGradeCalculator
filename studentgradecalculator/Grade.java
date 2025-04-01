package studentgradesystem;

public class Grade {
	private String studentID;
	private String courseCode;
	private double gradeValue;
	
	public Grade(String studentID, String courseCode, double gradeValue) {
		this.studentID = studentID;
		this.courseCode = courseCode;
		this.gradeValue = gradeValue;
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public double getGradeValue() {
		return gradeValue;
	}
	public void setGradeValue(double gradeValue) {
		this.gradeValue = gradeValue;
	}
	
}
