package ss19_string_regex.bai_tap.validate_phone;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone;
        System.out.println("enter phone number");
        phone = scanner.nextLine();
        if (!checkPhoneNumber(phone)) {
            System.out.println(phone + " :Invalid phone number");
        } else {
            System.out.println(phone + " :valid phone number");
        }
    }

    public static boolean checkPhoneNumber(String phone) {
        String regex = "^\\([\\d]{2}\\)-\\([0]\\d{9}\\)$";
        return phone.matches(regex);
    }
}
