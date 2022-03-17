package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl extends FacilityServiceImpl {
    private String roomStandard;
    private int numberOfFloors;
    Scanner scanner = new Scanner(System.in);
    private static List<House> houseList = new ArrayList<>();

    static {
        House house1 = new House("House", 250, 2000, 5,
                "year", "deluxe", 2);
        House house2 = new House("House", 250, 2000, 5,
                "year", "suite", 2);
        houseList.add(house1);
        FacilityServiceImpl.getFacilityIntegerMap().put(house1,4);
        houseList.add(house2);
        FacilityServiceImpl.getFacilityIntegerMap().put(house2,5);
    }

    public static List<House> getHouseList() {
        return houseList;
    }

    public static void setHouseList(List<House> houseList) {
        HouseServiceImpl.houseList = houseList;
    }

    public void addNewHouse() {
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
        System.out.println("you enter numer of floors");
        numberOfFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, usableArea, cost, numberOfPeople, rentalType, roomStandard, numberOfFloors);
        houseList.add(house);
        super.create(house);
    }
}
