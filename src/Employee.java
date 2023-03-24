public class Employee {
    private String name;
    private int dept;
    private double salary;
    private int id;
    public static int counter = 0;

    public Employee(String name, int dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        id = counter++;
    }

    public void setDept(int dept) {
        if (dept > 0) {
            this.dept = dept;
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "id: " + id + ". ФИО: " + name + ". Отдел: " + dept +
                ". Зарплата: " + salary;
    }
}
