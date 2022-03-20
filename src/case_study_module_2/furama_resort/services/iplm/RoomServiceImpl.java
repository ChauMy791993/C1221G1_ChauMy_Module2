package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Room;
import case_study_module_2.furama_resort.models.facility.Villa;
import case_study_module_2.furama_resort.utils.ReadAndWriteToCSV;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl {
    private String idRoom;
    private String freeService;
    private static final String ROOM_FILE="src/case_study_module_2/furama_resort/data/room.csv";
    private static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";
    Scanner scanner = new Scanner(System.in);
    private static List<Room> roomList = new ArrayList<>();


    static {
        Room room1 = new Room("SVRO-2212", "room", 150, 1000, 2,
                "day", "water");
        Room room2 = new Room("SVRO-2213", "room", 150, 1000, 2,
                "day", "food");
        roomList.add(room1);
        FacilityServiceImpl.getFacilityIntegerMap().put(room1, 2);
        roomList.add(room2);
        FacilityServiceImpl.getFacilityIntegerMap().put(room2, 5);
        ReadAndWriteToCSV.readRoomListFromCSV(ROOM_FILE);
    }

    public static List<Room> getRoomList() {
        return roomList;
    }

    public static void setRoomList(List<Room> roomList) {
        RoomServiceImpl.roomList = roomList;
    }

    public void addNewRoom() {
        System.out.println("you enter id room");
        idRoom = RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "wrong format ! SVRO-XXXX (X is number)");
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
        System.out.println("you enter free service");
        freeService = RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "wrong format ! Xx..x");
        Room room = new Room(idRoom, serviceName, usableArea, cost, numberOfPeople, rentalType, freeService);
        roomList.add(room);
        ReadAndWriteToCSV.writeListToCSV(ROOM_FILE,roomList);
        super.create(room);
    }
}
