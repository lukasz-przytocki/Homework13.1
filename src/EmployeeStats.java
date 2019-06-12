public class EmployeeStats {

    double averageSalary(Employee[] employees){
        double sum=0;

        for (int i = 0; i <employees.length ; i++) {
            sum+=employees[i].getSalary();

        }

        return sum/employees.length;
    }

    double leastSalary(Employee[] employees) {
        double salary = employees[0].getSalary();
        double[] salaryTable = new double[employees.length];

        for (int i = 0; i < employees.length; i++) {
            salaryTable[i] = employees[i].getSalary();
            if (isLeast(salaryTable, salary)) {
                salary = salaryTable[i];
            }
        }return salary;
    }

    double higherSalary(Employee[] employees) {
        double salary = employees[0].getSalary();
        double[] salaryTable = new double[employees.length];

        for (int i = 0; i < employees.length; i++) {
            salaryTable[i] = employees[i].getSalary();
            if (!isLeast(salaryTable, salary)) {
                salary = salaryTable[i];
            }
        }return salary;
    }

    int employeeNumber(Employee[] employees, String department){
        int count=0;
        for (int i = 0; i <employees.length ; i++) {
            if(employees[i].getDepartment()==department) {
                count++;
            }
        }

        return count;
    }



    private boolean isLeast(double[] salaryTable, double salary){
        salary = salaryTable[0];
        for (double tSalary:salaryTable) {
            if(salary<tSalary){
                return false;
            }
        }return true;

    }

}
