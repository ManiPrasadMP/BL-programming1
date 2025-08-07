package objectOriented.student_enroll;

import java.util.Scanner;

public class MainStudentTest {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Student student = new Student("Arjun", 3);
	        int choice;

	        do {
	            System.out.println("Student Course Enrollment Menu");
	            System.out.println("1. Enroll in Math Course");
	            System.out.println("2. Enroll in Physics Course");
	            System.out.println("3. Enroll in History Course");
	            System.out.println("4. Mark Attendance");
	            System.out.println("5. Assign Grade");
	            System.out.println("6. View Enrolled Courses");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    student.enrollInCourse(new Maths());
	                    break;
	                case 2:
	                    student.enrollInCourse(new Physics());
	                    break;
	                case 3:
	                    student.enrollInCourse(new History());
	                    break;
	                case 4:
	                    for (int i = 0; i < student.getCourseCount(); i++) {
	                        System.out.println(i + ": " + student.getCourseName(i));
	                    }
	                    System.out.print("Select course index to mark attendance: ");
	                    int attIndex = sc.nextInt();
	                    student.markAttendance(attIndex);
	                    break;
	                case 5:
	                    for (int i = 0; i < student.getCourseCount(); i++) {
	                        System.out.println(i + ": " + student.getCourseName(i));
	                    }
	                    System.out.print("Select course index to assign grade: ");
	                    int gradeIndex = sc.nextInt();
	                    System.out.print("Enter grade: ");
	                    double grade = sc.nextDouble();
	                    student.assignGrade(gradeIndex, grade);
	                    break;
	                case 6:
	                    student.viewEnrolledCourses();
	                    break;
	                case 7:
	                    System.out.println("Exiting system.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 7);

	        sc.close();
    }
}
