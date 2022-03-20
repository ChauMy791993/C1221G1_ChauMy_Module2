package case_study_module_2.furama_resort.controllers;

import case_study_module_2.furama_resort.enums.CustomerType;
import case_study_module_2.furama_resort.models.person.Customer;
import case_study_module_2.furama_resort.models.person.Employee;
import case_study_module_2.furama_resort.services.iplm.CustomerServiceImpl;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.Scanner;

public class CustomerController {
    private String name;
    private String dayOfBirth;
    private String gender;
    private long numberID;
    private String phoneNumber;
    private String email;
    private String customerID;
    private CustomerType customerType;
    private String address;
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void addNewCustomer() {
        System.out.println("you enter name");
        name = RegexData.regexStr(scanner.nextLine(), customerService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter day of birth");
        dayOfBirth = RegexData.regexStr(scanner.nextLine(),customerService.getREGEX_DATEOFBIRTH(),"wrong format! dd/mm/yyyy");
        System.out.println("you enter gender");
        gender = RegexData.regexStr(scanner.nextLine(), customerService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter id number");
        numberID = Long.parseLong(RegexData.regexStr(scanner.nextLine(), customerService.getREGEX_STRING(), "wrong format!"));
        System.out.println("you enter phone number");
        phoneNumber = RegexData.regexStr(scanner.nextLine(),customerService.getREGEX_PHONE(),"wrong format!");
        System.out.println("you enter email");
        email = RegexData.regexStr(scanner.nextLine(),customerService.getREGEX_MAIL(),"wrong format!");
        System.out.println("you enter customer id");
        customerID = RegexData.regexStr(scanner.nextLine(), customerService.getREGEX_STRING(), "wrong format!");
        System.out.println("you enter customer type");
        System.out.println("0. Diamond,\n" +
                "1. Platinium,\n" +
                "2. Gold,\n" +
                "3. Silver,\n" +
                "4. Member");
        int numberType = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < CustomerType.values().length; i++) {
            System.out.println(i + "-" + CustomerType.values()[i]);
        }
        customerType = CustomerType.values()[numberType];
        System.out.print("you enter address");
        address = RegexData.regexStr(scanner.nextLine(), customerService.getREGEX_STRING(), "wrong format!");
        Customer customer = new Customer(name, dayOfBirth, gender, numberID, phoneNumber, email, customerID, customerType, address);
        customerService.create(customer);
    }
    public void displayCustomer(){
        customerService.read();
    }
    public void editCustomer(){
        System.out.println("enter id customer you want fix");
        String findId = scanner.nextLine();
        for (int i = 0; i < customerService.getCustomerList().size(); i++) {
            if (customerService.getCustomerList().get(i).getCustomerID().equals(findId)) {
                int index = i;
                System.out.println(customerService.getCustomerList().get(i));
                customerService.update(index);
            }else {
                System.out.println("not find id customer");
            }
        }
    }
}
