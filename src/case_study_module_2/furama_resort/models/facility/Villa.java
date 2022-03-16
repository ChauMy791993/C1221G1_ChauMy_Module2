package case_study_module_2.furama_resort.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, int usableArea, double cost, int numbeOPeople, String rentalType, String roomStandard, int poolArea, int numberOfFloors) {
        super(serviceName, usableArea, cost, numbeOPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
