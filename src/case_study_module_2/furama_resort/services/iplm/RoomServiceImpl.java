package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Room;
import case_study_module_2.furama_resort.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl {
    private String freeService;
    Scanner scanner = new Scanner(System.in);
    private static List<Room> roomList = new ArrayList<>();

    static {
        Room room1 = new Room("room", 150, 1000, 2,
                "day", "water");
        Room room2 = new Room("room", 150, 1000, 2,
                "day", "food");
        roomList.add(room1);
        FacilityServiceImpl.getFacilityIntegerMap().put(room1, 2);
        roomList.add(room2);
        FacilityServiceImpl.getFacilityIntegerMap().put(room2, 5);
    }

    public static List<Room> getRoomList() {
        return roomList;
    }

    public static void setRoomList(List<Room> roomList) {
        RoomServiceImpl.roomList = roomList;
    }

    public void addNewRoom() {
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
        System.out.println("you enter free service");
        freeService = scanner.nextLine();
        Room room = new Room(serviceName, usableArea, cost, numberOfPeople, rentalType, freeService);
        roomList.add(room);
        super.create(room);
    }
}
