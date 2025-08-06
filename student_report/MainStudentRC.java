package objectOriented.student_report;

public class MainStudentRC {

	public static void main(String[] args) {
		
		Subject sb1 = new Subject("Java", 90);
		Subject sb2 = new Subject("Python", 67);
		Subject sb3 = new Subject("C", 97);
		Subject sb4 = new Subject("DBMS", 56);
		
		Student st = new Student("Sathish", 123, new Subject[] {sb1,sb2,sb3,sb4});
		
		ReportCard rc = new ReportCard(st);
		rc.printReport();
	}
}
