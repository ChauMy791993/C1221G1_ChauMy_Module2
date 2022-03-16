package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.enums.CustomerType;
import case_study_module_2.furama_resort.models.person.Customer;
import case_study_module_2.furama_resort.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    static {
        customerList.add(new Customer("thành phước", "21/12/1993", "nam",
                1547653, "0904455663", "phuoc@gmail.com",
                "14", CustomerType.Member, "sơn trà,đà nẵng"));
    }

    @Override
    public void create(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void read() {
        for (Customer customer : customerList) {
            System.out.println(customer);
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
                "7. customerID;\n" +
                "8. customerType;\n" +
                "9. address;");
        System.out.println("choose things you want fix");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("you enter name");
                customerList.get(index).setName(scanner.nextLine());
                break;
            case 2:
                System.out.println("you enter day of birth");
                customerList.get(index).setDayOfBirth(scanner.nextLine());
                break;
            case 3:
                System.out.println("you enter sex");
                customerList.get(index).setSex(scanner.nextLine());
                break;
            case 4:
                System.out.println("you enter id number");
                customerList.get(index).setNumberID(Long.parseLong(scanner.nextLine()));
                break;
            case 5:
                System.out.println("you enter phone number");
                customerList.get(index).setPhoneNumber(scanner.nextLine());
            case 6:
                System.out.println("you enter email");
                customerList.get(index).setEmail(scanner.nextLine());
            case 7:
                System.out.println("you enter customer id");
                customerList.get(index).setCustomerID(scanner.nextLine());
            case 8:
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
                customerList.get(index).setCustomerType(CustomerType.values()[numberType]);
                break;
            case 9:
                System.out.println("you enter address");
                customerList.get(index).setAddress(scanner.nextLine());
            default:
                System.out.println("wrong choice");
        }

    }

}
