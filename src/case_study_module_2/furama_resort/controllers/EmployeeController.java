package case_study_module_2.furama_resort.controllers;

import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.enums.EmployeeOfPosition;
import case_study_module_2.furama_resort.models.person.Employee;
import case_study_module_2.furama_resort.services.iplm.EmployeeServiceImpl;
import case_study_module_2.furama_resort.utils.ReadAndWriteToCSV;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.Scanner;

public class EmployeeController {
    private String name;
    private String dayOfBirth;
    private String gender;
    private long numberID;
    private String phoneNumber;
    private String email;
    private String employeeID;
    private EmployeeOfDegree degree;
    private EmployeeOfPosition position;
    private long salary;
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    Scanner scanner = new Scanner(System.in);


    public void addNewEmployee() {
        System.out.println("you enter name");
        name = RegexData.regexStr(scanner.nextLine(), employeeService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter day of birth");
        dayOfBirth = RegexData.regexStr(scanner.nextLine(),employeeService.getREGEX_DATEOFBIRTH(),"wrong format! dd/mm/yyyy");
        System.out.println("you enter gender");
        gender = RegexData.regexStr(scanner.nextLine(), employeeService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter id number");
        numberID = Long.parseLong(RegexData.regexStr(scanner.nextLine(), employeeService.getREGEX_STRING(), "wrong format!"));
        System.out.println("you enter phone number");
        phoneNumber = RegexData.regexStr(scanner.nextLine(),employeeService.getREGEX_PHONE(),"wrong format!");
        System.out.println("you enter email");
        email = RegexData.regexStr(scanner.nextLine(),employeeService.getREGEX_MAIL(),"wrong format!");
        System.out.println("you enter employee id");
        employeeID = RegexData.regexStr(scanner.nextLine(), employeeService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter degree");
        System.out.println("0.Trung_cấp,\n" +
                "1. Cao_đẳng,\n" +
                "2. Đại_học,\n" +
                "3. Sau_đại_học");
        int numberDegree = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < EmployeeOfDegree.values().length; i++) {
            System.out.println(i + "-" + EmployeeOfDegree.values()[i]);
        }
        degree = EmployeeOfDegree.values()[numberDegree];
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
        position = EmployeeOfPosition.values()[numberPosition];
        System.out.println("you enter salary");
        salary = Long.parseLong(RegexData.regexStr(scanner.nextLine(), employeeService.getREGEX_STRING(), "wrong format!"));
        Employee employee = new Employee(name, dayOfBirth, gender, numberID, phoneNumber, email, employeeID, degree, position, salary);
        employeeService.create(employee);

    }

    public void displayEmployee() {
        employeeService.read();
    }

    public void editEmployee() {
        System.out.println("enter id employee you want fix");
        String findId = scanner.nextLine();
        for (int i = 0; i < EmployeeServiceImpl.getEmployeeList().size(); i++) {
            if (EmployeeServiceImpl.getEmployeeList().get(i).getEmployeeID().equals(findId)) {
                int index = i;
                System.out.println(EmployeeServiceImpl.getEmployeeList().get(i));
                employeeService.update(index);
                ReadAndWriteToCSV.writeListToCSV(employeeService.getEMPLOYEE_FILE(), EmployeeServiceImpl.getEmployeeList());
            } else {
                System.out.println("not find id employee");
            }
        }
    }
}
