package objectOriented.employee_management;

class Employee {
    private int id;
    private String name;
    private Designation designation;
    private double salary;

    public Employee(int id, String name, Designation designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void promote() {
        Designation next = designation.nextLevel();
        if (next != null) {
            designation = next;
            increaseSalary();
            System.out.println(name + " promoted to " + designation + " with new salary Rs. " + salary);
        } else {
            System.out.println(name + " is already at the highest level (" + designation + ").");
        }
    }

    private void increaseSalary() {
        switch (this.designation) {
            case MID:
                salary += 5000;
                break;
            case SENIOR:
                salary += 7000;
                break;
            case LEAD:
                salary += 10000;
                break;
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Designation: " + designation + ", Salary: Rs." + salary);
    }

    public int getId() {
        return id;
    }
}
