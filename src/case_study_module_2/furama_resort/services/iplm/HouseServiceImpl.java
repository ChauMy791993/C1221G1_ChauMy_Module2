package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.House;
import case_study_module_2.furama_resort.utils.ReadAndWriteToCSV;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl extends FacilityServiceImpl {
    private String idHouse;
    private String roomStandard;
    private int numberOfFloors;
    private static final String HOUSE_FILE = "src/case_study_module_2/furama_resort/data/house.csv";
    private static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";
    Scanner scanner = new Scanner(System.in);
    private static List<House> houseList = new ArrayList<>();

    static {
        House house1 = new House("SVHO-1122", "House", 250, 2000, 5,
                "year", "deluxe", 2);
        House house2 = new House("SVHO-1133", "House", 250, 2000, 5,
                "year", "suite", 2);
        houseList.add(house1);
        FacilityServiceImpl.getFacilityIntegerMap().put(house1, 4);
        houseList.add(house2);
        FacilityServiceImpl.getFacilityIntegerMap().put(house2, 5);
        ReadAndWriteToCSV.readHouseListFromCSV(HOUSE_FILE);
    }

    public static List<House> getHouseList() {
        return houseList;
    }

    public static void setHouseList(List<House> houseList) {
        HouseServiceImpl.houseList = houseList;
    }

    public void addNewHouse() {
        System.out.println("you enter id house");
        idHouse = RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "wrong format ! SVHO-XXXX (X is number)");
        System.out.println("you enter service name");
        serviceName = RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format ! Xx..x");
        System.out.println("you enter usable area");
        usableArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "wrong format ! area >30"));
        System.out.println("you enter cost");
        cost = Double.parseDouble(RegexData.regexStr(scanner.nextLine(), REGEX_COST_FLOOR, "wrong format ! cost is positive"));
        System.out.println("you enter number of people");
        numberOfPeople = Integer.parseInt(RegexData.regexStr(scanner.nextLine(), REGEX_PEOPLE, "wrong format ! 0 < number of people < 20 "));
        System.out.println("you enter rental type");
        rentalType = RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format ! Xx..x");
        System.out.println("you enter room standard");
        roomStandard = RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format ! Xx..x");
        System.out.println("you enter numer of floors");
        numberOfFloors = Integer.parseInt(RegexData.regexStr(scanner.nextLine(), REGEX_COST_FLOOR, "wrong format ! cost is positive"));
        House house = new House(idHouse, serviceName, usableArea, cost, numberOfPeople, rentalType, roomStandard, numberOfFloors);
        houseList.add(house);
        ReadAndWriteToCSV.writeListToCSV(HOUSE_FILE, houseList);
        super.create(house);
    }
}
