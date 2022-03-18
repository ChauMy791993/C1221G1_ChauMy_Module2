package case_study_module_2.furama_resort.models.facility;

//class cơ sở vật chất
public abstract class Facility {
    private String serviceName  ;
    private double usableArea;
    private double cost;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double cost, int numbeOPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.cost = cost;
        this.numberOfPeople = numbeOPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType=" + rentalType + '\''
                ;
    }
}
