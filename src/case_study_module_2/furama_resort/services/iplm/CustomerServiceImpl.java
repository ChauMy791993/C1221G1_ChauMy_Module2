package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.enums.CustomerType;
import case_study_module_2.furama_resort.models.person.Customer;
import case_study_module_2.furama_resort.services.ICustomerService;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    private final String REGEX_STRING = "^[\\w\\s]+$";
    private final String REGEX_DATEOFBIRTH ="^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/\\d\\d\\d\\d$";
    private final String REGEX_PHONE = "^\\d{10}$";
    private final String REGEX_MAIL = "^\\w+\\@\\w+\\.[a-z]+$";

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
                "3. gender\n" +
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
                customerList.get(index).setName(RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format!"));
                break;
            case 2:
                System.out.println("you enter day of birth");
                customerList.get(index).setDayOfBirth( RegexData.regexStr(scanner.nextLine(),REGEX_DATEOFBIRTH,"wrong format! dd/mm/yyyy"));
                break;
            case 3:
                System.out.println("you enter gender");
                customerList.get(index).setGender(RegexData.regexStr(scanner.nextLine(),REGEX_STRING, "wrong format!"));
                break;
            case 4:
                System.out.println("you enter id number");
                customerList.get(index).setNumberID(Long.parseLong(RegexData.regexStr(scanner.nextLine(),REGEX_STRING, "wrong format!")));
                break;
            case 5:
                System.out.println("you enter phone number");
                customerList.get(index).setPhoneNumber(RegexData.regexStr(scanner.nextLine(),REGEX_PHONE,"wrong format!"));
            case 6:
                System.out.println("you enter email");
                customerList.get(index).setEmail(RegexData.regexStr(scanner.nextLine(),REGEX_MAIL,"wrong format!"));
            case 7:
                System.out.println("you enter customer id");
                customerList.get(index).setCustomerID(RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format!"));
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
                customerList.get(index).setAddress(RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format!"));
            default:
                System.out.println("wrong choice");
        }

    }

}
