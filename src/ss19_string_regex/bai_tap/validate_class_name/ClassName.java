package ss19_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class ClassName {
    public static boolean checkNameClass(String className) {
        String regex = "^[CAP](\\d{4})[GHIKLM]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        System.out.println("enter name class");
        className = scanner.nextLine();
        if (!checkNameClass(className)) {
            System.out.println(className + " :Invalid class name");
        } else {
            System.out.println(className+" :valid class name");
        }
    }
}
