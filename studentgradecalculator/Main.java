package studentgradesystem;


public class Main {
	public static void main(String[] args) {
		//Test cases for student class
		
		// Test case 1: Add and create a new student to the system. 
		Student student1 = new Student("Amanda Koka","26450453");
		Student student2 = new Student("John Doe","26450000");
		Student student3 = new Student("Bob Steven","26450001");
		/* 
		 * student1.setName("AMANDA");
		 * System.out.println(student1.getName());
		 */
		// Test case 2: Create and add a new course 
		Course course1 = new Course("CIS1702", "PROGRAMMING 1");
		Course course2 = new Course("CIS1703", "PROGRAMMING 2");
		Course course3 = new Course("CIS1701", "COMPUTER SYSTEMS ARCHITECTURE & NETWORKS");
		
		
		// Test case 3: Enrol student in the course 
		student1.enrollCourse(course1);
		student1.enrollCourse(course2);
		student1.enrollCourse(course3);
		
		student2.enrollCourse(course1);
		
		student3.enrollCourse(course1);
		student3.enrollCourse(course2);
		student3.enrollCourse(course3);
		
		// Test case 4: Print the enrolled courses the student takes
		System.out.println("Student Name: " + student1.getName());
	    student1.listCourses();
	    
	    System.out.println("Student Name: " + student2.getName());
	    student2.listCourses();
	    
	    System.out.println("Student Name: " + student3.getName());
	    student3.listCourses();
	     
	    // Test cases for Course class
	    
	    // Test case 5: Add student to a course
	    course1.addStudent(student1);
	    course1.addStudent(student2);
	    course1.addStudent(student3);
	    
	    course2.addStudent(student1);
	    course2.addStudent(student3);
	    
	    course3.addStudent(student1);
	    course3.addStudent(student3);
	    
	    // Test case 6: List students on a course
	    course1.listStudent();
	    course2.listStudent();
	    course3.listStudent();
	    
	    // Test case 7: Assign grade to students on a course 
	    course1.assignGrade(student1, 70.0);
	    course1.assignGrade(student2, 15.0);
	    course1.assignGrade(student3, 54.0);
	    
	    course2.assignGrade(student1, 80.0);
	    course2.assignGrade(student3, 75.0);
	    
	    course3.assignGrade(student1, 85.0);
	    course3.assignGrade(student3, 77.0);
	    
	    // Test case 8: Work out the average grade of student 
	    student1.averageGrade();
        student2.averageGrade();
        student3.averageGrade();
	    
	}
}