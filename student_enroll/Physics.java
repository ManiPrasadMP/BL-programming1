package objectOriented.student_enroll;

class Physics implements Course {
    private String faculty = "Dr. Rajesh";

    @Override
    public void enroll() {
        System.out.println("Enrolled in Physics with " + faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("Physics Content: Mechanics, Thermodynamics, Optics");
    }

    @Override
    public String getCourseName() {
        return "Physics";
    }
}
