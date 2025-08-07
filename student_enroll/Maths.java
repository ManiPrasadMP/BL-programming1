package objectOriented.student_enroll;

class Maths implements Course {
    private String faculty = "Dr. Parameshwar";

    @Override
    public void enroll() {
        System.out.println("Enrolled in Math with " + faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("Math Content: Algebra, Calculus, Geometry");
    }

    @Override
    public String getCourseName() {
        return "Math";
    }
}
