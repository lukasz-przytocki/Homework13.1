import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeReader {

    Employee[] employeeReader(String employeeFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(employeeFile));
        Employee[] employees = new Employee[employeeCounter(employeeFile)];
        String[] employee;
        int i=0;

        while (scan.hasNextLine()){
            employee=scan.nextLine().split(";");
            employees[i] = new Employee(employee[0], employee[1], employee[2],employee[3],Double.valueOf(employee[4]));
            i++;
        }

        return employees;
    }

    private int employeeCounter(String employeeFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(employeeFile));
        int counter = 0;

        while (scan.hasNextLine()){
            counter++;
            scan.nextLine();
        }
        return counter;
    }

}
