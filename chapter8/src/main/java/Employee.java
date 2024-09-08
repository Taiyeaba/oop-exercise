import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate hireDate;
    
    public Employee(String firstName, String lastName, LocalDate birthDate, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}


