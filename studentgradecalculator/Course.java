package studentgradesystem;

import java.util.ArrayList;
import java.util.List;

//Course class
public class Course {
	// Course class attributes
	private String courseCode;
	private String courseName;
	private List<Student> enrolledStudent;
	private List<Grade> courseGrade;
		
	/* Course constructor so we can store course information.
	 * Constructors are used to initialise objects,
	 * its called when an object of a class is created.
	 */
	public Course(String courseCode, String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.enrolledStudent = new ArrayList<>();
		this.courseGrade = new ArrayList<>();
	}
		
	//Getters and setters 
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getEnrolledStudent() {
		return enrolledStudent;
	}
	public void setEnrolledStudent(List<Student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}
	public List<Grade> getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(List<Grade> courseGrade) {
		this.courseGrade = courseGrade;
	}
		
	// Course class methods 
	/*
	 * Add student to a course method: 
	 * adds a student to a course 
	 */
	public void addStudent(Student student ) {
		if (!enrolledStudent.contains(student)) { // Make sure the same student isn't added
			enrolledStudent.add(student);
		}
	}
		
	// Lists students on a course method: 
	public void listStudent() {
		System.out.println("The students enrolled on course " + courseName + " are:" );
		for (Student student: enrolledStudent ) {
			System.out.println(student.getName());
		}
		System.out.println("");		
	}
		
	// Assign grade method
	public void assignGrade( Student student, double gradeValue) {
			
		Grade grade = new Grade(student.getStudentID(), this.courseCode, gradeValue);
		this.courseGrade.add(grade);
			
		System.out.println(student.getName() + "'s grade for course " + this.courseName + ": " + grade.getGradeValue());
		System.out.println("");

	}		
}