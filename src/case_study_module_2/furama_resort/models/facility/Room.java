package case_study_module_2.furama_resort.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, int usableArea, double cost, int numberOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, cost, numberOfPeople, rentalType);
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
