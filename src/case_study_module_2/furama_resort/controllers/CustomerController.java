package case_study_module_2.furama_resort.controllers;

import case_study_module_2.furama_resort.enums.CustomerType;
import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.services.iplm.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    private String name;
    private String dayOfBirth;
    private String sex;
    private long numberID;
    private String phoneNumber;
    private String email;
    private String customerID;
    private CustomerType customerType;
    private String address;
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void inputBaseInfo() {
        System.out.println("you enter name");
        name = scanner.nextLine();
        System.out.println("you enter day of birth");
        dayOfBirth = scanner.nextLine();
        System.out.println("you enter sex");
        sex = scanner.nextLine();
        System.out.println("you enter id number");
        numberID = Long.parseLong(scanner.nextLine());
        System.out.println("you enter phone number");
        phoneNumber = scanner.nextLine();
        System.out.println("you enter email");
        email = scanner.nextLine();
    }

    public void addNewCustomer() {
        this.inputBaseInfo();
        System.out.println("you enter customer id");
        customerID = scanner.nextLine();
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
