package case_study_module_2.furama_resort.models.facility;

public class Room extends Facility {
    private String idRoom;
    private String freeService;

    public Room() {
    }

    public Room(String idRoom, String serviceName, double usableArea, double cost, int numberOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, cost, numberOfPeople, rentalType);
        this.idRoom = idRoom;
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom='" + idRoom + '\'' +
                super.toString() +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return idRoom + super.getInfoToCSV() + "," + freeService;
    }
}
