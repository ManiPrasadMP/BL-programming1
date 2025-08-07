package objectOriented.student_enroll;

class Student {
    private String name;
    private Course[] enrolledCourses;
    private double[] grades;
    private int[] attendance;
    private int courseCount = 0;

    public Student(String name, int maxCourses) {
        this.name = name;
        this.enrolledCourses = new Course[maxCourses];
        this.grades = new double[maxCourses];
        this.attendance = new int[maxCourses];
    }

    public void enrollInCourse(Course course) {
        if (courseCount < enrolledCourses.length) {
            enrolledCourses[courseCount] = course;
            grades[courseCount] = -1;
            attendance[courseCount] = 0;
            course.enroll();
            courseCount++;
        } else {
            System.out.println("Cannot enroll in more courses.");
        }
    }

    public void markAttendance(int index) {
        if (index >= 0 && index < courseCount) {
            attendance[index]++;
            System.out.println("Marked attendance for " + enrolledCourses[index].getCourseName());
        }
    }

    public void assignGrade(int index, double grade) {
        if (index >= 0 && index < courseCount) {
            grades[index] = grade;
            System.out.println("Assigned grade " + grade + " for " + enrolledCourses[index].getCourseName());
        }
    }

    public void viewEnrolledCourses() {
        System.out.println("\nStudent: " + name);
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course: " + enrolledCourses[i].getCourseName());
            enrolledCourses[i].viewContent();
            System.out.println("Grade: " + (grades[i] == -1 ? "Not graded" : grades[i]));
            System.out.println("Attendance: " + attendance[i] + " classes");
        }
    }
    
    public int getCourseCount() {
        return courseCount;
    }
    
    public String getCourseName(int index) {
        if (index >= 0 && index < courseCount) {
            return enrolledCourses[index].getCourseName();
        }
        return null;
    }
}
