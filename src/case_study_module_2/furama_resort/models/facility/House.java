package case_study_module_2.furama_resort.models.facility;

public class House extends Facility {
    private String idHouse;
    private String roomStandard;
    private int numberOfFloors;


    public House() {
    }

    public House(String idHouse, String serviceName, double usableArea, double cost, int numberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, cost, numberOfPeople, rentalType);
        this.idHouse = idHouse;
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    @Override
    public String toString() {
        return "House{" + " idHouse='" + idHouse + '\''
                + super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return idHouse + super.getInfoToCSV() + roomStandard + "," + numberOfFloors;
    }
}
