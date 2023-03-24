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
        Employee employee = employees[0];
        double minSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + anyEmployee);
            }
        }
    }

    public void getMaxSalary() {
        Employee employee = employees[0];
        double maxSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + anyEmployee);
            }
        }
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
