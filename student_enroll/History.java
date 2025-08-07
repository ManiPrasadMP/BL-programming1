package objectOriented.student_enroll;

class History implements Course {
    private String faculty = "Dr. Sudeep";

    @Override
    public void enroll() {
        System.out.println("Enrolled in History with " + faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("History Content: Ancient, Medieval, Modern");
    }

    @Override
    public String getCourseName() {
        return "History";
    }
}
