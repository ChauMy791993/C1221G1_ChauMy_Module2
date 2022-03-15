package case_study_module_2.furama_resort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, int usableArea, double cost, int numbeOPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, cost, numbeOPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
