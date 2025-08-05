package objectOriented;

class Student {
    String name;
    int roll;
    Subject[] subjects;

    Student(String name, int roll, Subject[] subjects) {
        this.name = name;
        this.roll = roll;
        this.subjects = subjects;
    }
}