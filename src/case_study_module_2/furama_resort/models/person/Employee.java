package case_study_module_2.furama_resort.models.person;

import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.enums.EmployeeOfPosition;

public class Employee extends Person{
    private String employeeID;
    private EmployeeOfDegree degree;
    private EmployeeOfPosition position;
    private long salary;

    public Employee() {
    }

    public Employee(String name, String dayOfBirth, String gender, long idNumber, String phoneNumber, String email, String employeeID, EmployeeOfDegree degree, EmployeeOfPosition position, long salary) {
        super(name, dayOfBirth, gender, idNumber, phoneNumber, email);
        this.employeeID = employeeID;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeeOfDegree getDegree() {
        return degree;
    }

    public void setDegree(EmployeeOfDegree degree) {
        this.degree = degree;
    }

    public EmployeeOfPosition getPosition() {
        return position;
    }

    public void setPosition(EmployeeOfPosition position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                ", employeeID='" + employeeID + '\'' +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
