package case_study_module_2.furama_resort.models.facility;

public class Villa extends Facility {
    private String idVilla;
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String idVilla, String serviceName, double usableArea, double cost, int numberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceName, usableArea, cost, numberOfPeople, rentalType);
        this.idVilla = idVilla;
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

    public double getPoolArea() {
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

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "idVilla='" + idVilla + '\'' +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
