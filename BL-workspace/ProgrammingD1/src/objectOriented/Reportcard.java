package objectOriented;

class ReportCard {
    Student student;

    ReportCard(Student s) {
        this.student = s;
    }

    void printReport() {
        int total = 0;
        for (Subject sub : student.subjects)
            total += sub.marks;

        double avg = total / (double) student.subjects.length;
        char grade = avg >= 90 ? 'A' : avg >= 75 ? 'B' :
                     avg >= 60 ? 'C' : avg >= 50 ? 'D' : 'F';

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
