package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Villa;
import case_study_module_2.furama_resort.utils.ReadAndWriteToCSV;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl extends FacilityServiceImpl {
    private String idVilla;
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;
    private static final String VILLA_FILE="src/case_study_module_2/furama_resort/data/villa.csv";
    protected static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$";
    Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList<>();

    static {
        Villa villa1 = new Villa("SVVL-3314", "villa", 300, 2500, 4,
                "day", "suite", 50, 3);
        Villa villa2 = new Villa("SVVL-3315", "villa", 300, 2500, 4,
                "month", "deluxe", 50, 3);
        villaList.add(villa1);
        FacilityServiceImpl.getFacilityIntegerMap().put(villa1, 0);
        villaList.add(villa2);
        FacilityServiceImpl.getFacilityIntegerMap().put(villa2, 5);
//        ReadAndWriteToCSV.writeListToCSV(VILLA_FILE,villaList);
        ReadAndWriteToCSV.readVillaListFromCSV(VILLA_FILE);
    }

    public static List<Villa> getVillaList() {
        return villaList;
    }

    public static void setVillaList(List<Villa> villaList) {
        VillaServiceImpl.villaList = villaList;
    }

    public void addNewVilla() {
        System.out.println("you enter id villa");
        idVilla = RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "wrong format ! SVVL-XXXX (X is number)");
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
        System.out.println("you enter number pool area");
        poolArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "wrong format ! area >30"));
        System.out.println("you enter numer of floors");
        numberOfFloors = Integer.parseInt(RegexData.regexStr(scanner.nextLine(), REGEX_COST_FLOOR, "wrong format ! cost is positive"));
        Villa villa = new Villa(idVilla, serviceName, usableArea, cost, numberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        villaList.add(villa);
        ReadAndWriteToCSV.writeListToCSV(VILLA_FILE,villaList);
        super.create(villa);

    }
}
