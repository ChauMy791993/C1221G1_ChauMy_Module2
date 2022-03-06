package candidate_management.services;

import candidate_management.model.Experience;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FunctionExperience implements IFunctions {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Experience> experiences = new ArrayList<>();

    static {
        experiences.add(new Experience(1, "châu", "mỹ", "07-09-1993",
                "Đà nẵng", 934954380, "my@gmail.com", 0, 4, "nhanh nhẹn"))
    }

    @Override
    public void creating() {
        boolean check = true;
        String choice = "Y";
        do {
            System.out.println("Creating Experience");
            System.out.println("Enter id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter firstName");
            String firstName = scanner.nextLine();
            System.out.println("Enter lastName");
            String lastName = scanner.nextLine();
            System.out.println("Enter birthday");
            String birth = scanner.nextLine();
            System.out.println("Enter address");
            String address = scanner.nextLine();
            System.out.println("Enter phone number");
            long phone = Long.parseLong(scanner.nextLine());
            System.out.println("Enter email");
            String email = scanner.nextLine();
            System.out.println("Enter candidate Type");
            int candidateType = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter year Of Experience");
            int yearOfExperience = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter professional Skill");
            String professionalSkill = scanner.nextLine();
            experiences.add(new Experience(id, firstName, lastName, birth, address, phone, email,
                    candidateType, yearOfExperience, professionalSkill));
            System.out.println(": Do you want to continue (Y/N)?. ");
            String select = scanner.nextLine();
            check = choice.equals(select.toUpperCase());
        } while (check);

    }

    @Override
    public void updating() {

    }

    @Override
    public void deleting() {

    }

    @Override
    public void searching() {

    }
}
