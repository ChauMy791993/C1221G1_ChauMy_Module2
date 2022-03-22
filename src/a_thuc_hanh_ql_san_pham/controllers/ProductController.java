package a_thuc_hanh_ql_san_pham.controllers;

import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
    private int choice = -1;
    public void displayMainMenu() {
        do {
            System.out.println("--Menu--\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("1. Display list employees\n" +
                                    "2. Add new employee\n" +
                                    "3. Edit employee\n" +
                                    "4. Return main menu\n");
                            try {
                                choice = Integer.parseInt(scanner.nextLine());
                                switch (choice) {
                                    case 1:
                                        employeeController.displayEmployee();
                                        break;
                                    case 2:
                                        employeeController.addNewEmployee();
                                        break;
                                    case 3:
                                        employeeController.editEmployee();
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("wrong number");
                                }
                            }catch (NumberFormatException e){
                                System.out.println("wrong format ! enter the number");
                            }
                        } while (choice != 4);
                        break;
                    case 2:
                        do {
                            System.out.println("1. Display list customers\n" +
                                    "2. Add new customer\n" +
                                    "3. Edit customer\n" +
                                    "4. Return main menu\n");
                            try {
                                choice = Integer.parseInt(scanner.nextLine());
                                switch (choice) {
                                    case 1:
                                        customerController.displayCustomer();
                                        break;
                                    case 2:
                                        customerController.addNewCustomer();
                                        break;
                                    case 3:
                                        customerController.editCustomer();
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("wrong number");
                                }
                            }catch (NumberFormatException e){
                                System.out.println("wrong format ! enter the number");
                            }
                        } while (choice != 4);

                        break;
                    case 3:
                        do {
                            System.out.println("1. Display list facility\n" +
                                    "2. Add new facility\n" +
                                    "3. Display list facility maintenance\n" +
                                    "4. Return main menu\n");
                            try {
                                choice = Integer.parseInt(scanner.nextLine());
                                switch (choice) {
                                    case 1:
                                        facilityController.displayFacilityList();
                                        break;
                                    case 2:
                                        System.out.println("1. Add New Villa\n" +
                                                "2. Add New House\n" +
                                                "3. Add New Room\n" +
                                                "4. Back to menu\n");
                                        System.out.println("enter your choice !");
                                        choice = Integer.parseInt(scanner.nextLine());
                                        facilityController.addNewFacility(choice);
                                        break;
                                    case 3:
                                        facilityController.displayMaintenanceList();
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("wrong number");
                                }
                            }catch (NumberFormatException e){
                                System.out.println("wrong format ! enter the number");
                            }
                        } while (choice != 4);
                        break;
                    case 4:
                        System.out.println("1. Add new booking\n" +
                                "2. Display list booking\n" +
                                "3. Create new constracts\n" +
                                "4. Display list contracts\n" +
                                "5. Edit contracts\n" +
                                "6. Return main menu\n");
                        choice = Integer.parseInt(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("1. Display list customers use service\n" +
                                "2. Display list customers get voucher\n" +
                                "3. Return main menu\n");
                        break;
                    case 6:
                        System.exit(6);
                    default:
                        System.out.println("wrong number");
                }
            }catch (NumberFormatException e){
                System.out.println("wrong format ! enter the number");
            }
        } while (choice != 6);

    }
}
