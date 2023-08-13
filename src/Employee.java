import java.util.Objects;

/**
 * Сотрудник
 */
public class Employee {
    private final Integer id;
    private String fullName;
    private Integer salary;
    private Integer departamentId;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departamentId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departamentId = departamentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartamentId() {
        return departamentId;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartamentId(Integer departamentId) {
        this.departamentId = departamentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullName, employee.fullName) && Objects.equals(salary, employee.salary) && Objects.equals(departamentId, employee.departamentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, departamentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departamentId=" + departamentId +
                '}';
    }
}