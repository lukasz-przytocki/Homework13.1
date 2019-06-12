import java.io.FileNotFoundException;

public class EmployeesTest {
    public static void main(String[] args) {
        EmployeeReader emplReader = new EmployeeReader();
        EmployeeStats employeeStats = new EmployeeStats();

        try {
            Employee[] employees;
            employees = emplReader.employeeReader("file.csv");
            System.out.println("Average salary: " + employeeStats.averageSalary(employees));
            System.out.println("Lower salary: "+employeeStats.leastSalary(employees));
            System.out.println("Higher salary: " + employeeStats.higherSalary(employees));
            System.out.println("Employee number in depatment it: "+ employeeStats.employeeNumber(employees,"it"));
            for (Employee emp:employees) {
                System.out.println(emp.employeeInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No file with specified name");
        }



    }

}
