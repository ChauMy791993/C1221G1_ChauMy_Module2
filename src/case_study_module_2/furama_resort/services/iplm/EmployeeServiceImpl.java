package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.enums.EmployeeOfPosition;
import case_study_module_2.furama_resort.models.person.Employee;
import case_study_module_2.furama_resort.services.IEmployeeService;
import case_study_module_2.furama_resort.utils.ReadAndWriteToCSV;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private final String REGEX_STRING = "^[\\w\\s]+$";
    private final String REGEX_DATEOFBIRTH ="^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/\\d\\d\\d\\d$";
    private final String REGEX_PHONE = "^\\d{10}$";
    private final String REGEX_MAIL = "^\\w+\\@\\w+\\.[a-z]+$";
    private static final String EMPLOYEE_FILE="src/case_study_module_2/furama_resort/data/employee.csv";

    public String getEMPLOYEE_FILE() {
        return EMPLOYEE_FILE;
    }

    public String getREGEX_STRING() {
        return REGEX_STRING;
    }

    public String getREGEX_DATEOFBIRTH() {
        return REGEX_DATEOFBIRTH;
    }

    public String getREGEX_PHONE() {
        return REGEX_PHONE;
    }

    public String getREGEX_MAIL() {
        return REGEX_MAIL;
    }


    static {
        employeeList.add(new Employee("Châu Mỹ", "7/9/1993", "nam", 1222345,
                "0934567891", "chaumy@gmail.com", "111223",
                EmployeeOfDegree.Đại_học, EmployeeOfPosition.Quản_lý, 20000));
        ReadAndWriteToCSV.writeListToCSV(EMPLOYEE_FILE,employeeList);
        ReadAndWriteToCSV.readEmployeeListFromCSV(EMPLOYEE_FILE);
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeServiceImpl.employeeList = employeeList;
    }

    @Override
    public void create(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteToCSV.writeListToCSV(EMPLOYEE_FILE,employeeList);

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
                "3. gender\n" +
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
                employeeList.get(index).setName(RegexData.regexStr(scanner.nextLine(),REGEX_STRING, "wrong format!"));
                break;
            case 2:
                System.out.println("you enter day of birth");
                employeeList.get(index).setDayOfBirth( RegexData.regexStr(scanner.nextLine(),REGEX_DATEOFBIRTH,"wrong format! dd/mm/yyyy"));
                break;
            case 3:
                System.out.println("you enter gender");
                employeeList.get(index).setGender(RegexData.regexStr(scanner.nextLine(),REGEX_STRING, "wrong format!"));
                break;
            case 4:
                System.out.println("you enter id number");
                employeeList.get(index).setNumberID(Long.parseLong(RegexData.regexStr(scanner.nextLine(),REGEX_STRING, "wrong format!")));
                break;
            case 5:
                System.out.println("you enter phone number");
                employeeList.get(index).setPhoneNumber(RegexData.regexStr(scanner.nextLine(),REGEX_PHONE,"wrong format!"));
            case 6:
                System.out.println("you enter email");
                employeeList.get(index).setEmail(RegexData.regexStr(scanner.nextLine(),REGEX_MAIL,"wrong format!"));
            case 7:
                System.out.println("you enter employee id");
                employeeList.get(index).setEmployeeID(RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format!"));
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
                employeeList.get(index).setSalary(Long.parseLong(RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format!")));
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
