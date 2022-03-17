package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl extends FacilityServiceImpl {
    private String roomStandard;
    private int poolArea;
    private int numberOfFloors;
    Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList<>();

    static {
        Villa villa1 = new Villa("villa", 300, 2500, 4,
                "day", "suite", 50, 3);
        Villa villa2 = new Villa("villa", 300, 2500, 4,
                "month", "deluxe", 50, 3);
        villaList.add(villa1);
        FacilityServiceImpl.getFacilityIntegerMap().put(villa1, 0);
        villaList.add(villa2);
        FacilityServiceImpl.getFacilityIntegerMap().put(villa2, 5);
    }

    public static List<Villa> getVillaList() {
        return villaList;
    }

    public static void setVillaList(List<Villa> villaList) {
        VillaServiceImpl.villaList = villaList;
    }

    public void addNewVilla() {
        System.out.println("you enter service name");
        serviceName = scanner.nextLine();
        System.out.println("you enter usable area");
        usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("you enter cost");
        cost = Double.parseDouble(scanner.nextLine());
        System.out.println("you enter number of people");
        numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("you enter rental type");
        rentalType = scanner.nextLine();
        System.out.println("you enter room standard");
        roomStandard = scanner.nextLine();
        System.out.println("you enter number pool area");
        poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("you enter numer of floors");
        numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, usableArea, cost, numberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        villaList.add(villa);
        super.create(villa);
    }
}
