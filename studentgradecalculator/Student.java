package studentgradesystem;

import java.util.ArrayList;
import java.util.List;

//Student class 
public class Student {
	// Student class attributes 
	private String name;
	private String studentID;
	private List<Course> enrolledCourse;
		
	/* Student constructor so we can store student information in
	 * the attributes of the object.
	 * Constructors are used to initialise objects,
	 * its called when an object of a class is created.
	 */
	public Student(String name, String studentID) {
		this.setName(name);
		this.setStudentID(studentID);
		this.enrolledCourse = new ArrayList<>();
		// https://www.geeksforgeeks.org/initializing-a-list-in-java/
	}
	/*
	 *  Student name, ID and enrolled course getter and setter.
	 *  Using encapsulation allows us to access private attributes
	 *  through public get and set methods. 
	 *  It allows us to get the value of the objects attributes and
	 *  alter and change them.
	 */
	 // Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// StudentID 
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	// EnrolledCourse
	public List<Course> getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(List<Course> enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}	
	/* Methods (functions) are blocks of code that have a set of
	 * instructions and used to perform a specific task.
	 */
		
	/*
	 * Student enrol course method: 
	 * adds a course to the students enrolledCourse list
	 */
	public void enrollCourse(Course course) { 
		// Used void because it doesn't return a value.
		 if (!enrolledCourse.contains(course)) {  // Make sure the same course isn't added
		        enrolledCourse.add(course);
		        course.addStudent(this);  
		 }		
	}
	/*
	 * Students list courses method
	 */
	public void listCourses() {
		// Checks if the list is empty
		if (enrolledCourse.isEmpty()) {
			System.out.println(name + " is not enrolled in any courses.");				
		} else {
			System.out.println(name + " is enrolled in these courses:");
			// for each course in enrolled course, print the course name
			for (Course course : enrolledCourse) {
				System.out.println(course.getCourseCode() + ": " + course.getCourseName());
			}
			System.out.println("");
		}
	}
	/*
	 * Student average grade method.
	 * Average (mean) = sum of all numbers / how many numbers there are.
	 * Need two variables, one to store the total sum of grades, one for counting how many grades.
	 * Step 1: student can be enrolled in multiple courses so need access all.
	 * Step 2: each course has grade list, need to check the grade belongs to said student.
	 * Step 3: if grade belongs to student add to sum
	 * Step 4: check that there are grades if there's none print a message stating no grades.
	 * otherwise divide total by num of grades
	 */
	public void averageGrade() {
		double totalSum = 0;
		int gradeCount = 0;
		// for each course in enrolled course list 
		for (Course course : enrolledCourse) {
			// for each grade assigned in course
			for (Grade grade : course.getCourseGrade()) {
				// if the studentid stored in grade is equal to the student id 
				if (grade.getStudentID().equals(this.studentID)) {
					totalSum +=grade.getGradeValue(); // add the grade the total sum
					gradeCount++; // add 1 each time it finds one 
				}
			}
		}
		// if no grades have been counted print this message.
		if (gradeCount <= 0) {
			System.out.println(name + " has no grades.");
		} else { // calculate the average 
			double average = totalSum / gradeCount;
	        System.out.println(name + "'s average grade across all courses is: " + average);
		}
		
	}		
}
