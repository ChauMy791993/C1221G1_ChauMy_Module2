package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.enums.EmployeeOfPosition;
import case_study_module_2.furama_resort.models.person.Employee;
import case_study_module_2.furama_resort.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee("Châu Mỹ", "7/9/1993", "nam", 1222345,
                "0934567891", "chaumy@gmail.com", "111223",
                EmployeeOfDegree.Đại_học, EmployeeOfPosition.Quản_lý, 20000));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void create(Employee employee) {
        employeeList.add(employee);

    }

    @Override
    public void read() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    @Override
    public void update(int index) {
        System.out.println("1. name\n" +
                "2. dayOfBirth\n" +
                "3. sex\n" +
                "4. idNumber\n" +
                "5. phoneNumber\n" +
                "6. email\n" +
                "7. employeeID;\n" +
                "8. degree;\n" +
                "9. position;\n" +
                "10. salary;");
        System.out.println("choose things you want fix");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("you enter name");
                employeeList.get(index).setName(scanner.nextLine());
                break;
            case 2:
                System.out.println("you enter day of birth");
                employeeList.get(index).setDayOfBirth(scanner.nextLine());
                break;
            case 3:
                System.out.println("you enter sex");
                employeeList.get(index).setSex(scanner.nextLine());
                break;
            case 4:
                System.out.println("you enter id number");
                employeeList.get(index).setNumberID(Long.parseLong(scanner.nextLine()));
                break;
            case 5:
                System.out.println("you enter phone number");
                employeeList.get(index).setPhoneNumber(scanner.nextLine());
            case 6:
                System.out.println("you enter email");
                employeeList.get(index).setEmail(scanner.nextLine());
            case 7:
                System.out.println("you enter employee id");
                employeeList.get(index).setEmployeeID(scanner.nextLine());
            case 8:
                System.out.println("you enter degree");
                System.out.println("0.Trung_cấp,\n" +
                        "1. Cao_đẳng,\n" +
                        "2. Đại_học,\n" +
                        "3. Sau_đại_học");
                int numberDegree = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < EmployeeOfDegree.values().length; i++) {
                    System.out.println(i + "-" + EmployeeOfDegree.values()[i]);
                }
                employeeList.get(index).setDegree(EmployeeOfDegree.values()[numberDegree]);
                break;
            case 9:
                System.out.println("you enter position");
                System.out.println("0. Lễ_tân,\n" +
                        "1. Phục_vụ,\n" +
                        "2. Chuyên_viên,\n" +
                        "3. Giám_sát,\n" +
                        "4. Quản_lý,\n" +
                        "5. Giám_đốc");
                int numberPosition = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < EmployeeOfPosition.values().length; i++) {
                    System.out.println(i + "-" + EmployeeOfPosition.values()[i]);
                }
                employeeList.get(index).setPosition(EmployeeOfPosition.values()[numberPosition]);
                break;
            case 10:
                System.out.println("you enter salary");
                employeeList.get(index).setSalary(Long.parseLong(scanner.nextLine()));
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
