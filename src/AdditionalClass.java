public class AdditionalClass {
    private Employee[] employees;
    private int size;

    public AdditionalClass() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String foolName, int department, double salary) {
        Employee newEmployee = new Employee(foolName, department, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmpoyees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }
    public void getTotalSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты " + sum);
    }

    public void getMinSalary() {
        Employee minEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minEmployee.getSalary()) {
                minEmployee = employees[i];
            }
        }
                System.out.println("Сотрудник с минимальной зарплатой: " + minEmployee);
            }


    public void getMaxSalary() {
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
                System.out.println("Сотрудник с максимальной зарплатой: " + maxEmployee);
            }

    public void getAverageSalary() {
        double sum = 0;
        double averageSalary;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        averageSalary = sum / employees.length;

        System.out.println("Среднее значение зарплат составляет: " + averageSalary);
    }


    public void printAllNames() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getName());
        }
    }
}
