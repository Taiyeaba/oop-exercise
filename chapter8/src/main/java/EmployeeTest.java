import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1949, 7, 24);
        LocalDate hire = LocalDate.of(1988, 3, 12);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);
    }
}   
