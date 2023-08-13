public class Main {
    private static final Employee[] employees = {
            new Employee("Иванова Мария Сергеевна", 10000, 1),
            new Employee("Иванов Иван Фёдорович", 25000, 2),
            new Employee("Стрелков Даниил Анатольевич", 40000, 3),
            new Employee("Петров Иван Алексеевич", 40000, 2),
            new Employee("Щербакова Анна Александровна", 55000, 1),
            new Employee("Иванова Мария Ивановна", 25000, 1),
            new Employee("Гайдук Сергей Игорьевич", 43000, 2),
            new Employee("Черкашин Гаврил Филлипович", 42000, 1),
            new Employee("Гудков Сергей Иванович", 49000, 3),
            new Employee("Сергеев Михаил Андреевич", 64000, 3),
    };
    public static void main(String[] args) {
        printEmployees();
        System.out.println("Сумма всех зарплат:" + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата: " +calculateAverageSalary());
        printFullNames();
    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];

        for (Employee employee : employees) {
            if(employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];

        for (Employee employee : employees) {
            if(employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}