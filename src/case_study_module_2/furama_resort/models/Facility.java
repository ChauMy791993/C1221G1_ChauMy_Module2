package case_study_module_2.furama_resort.models;

//class cơ sở vật chất
public abstract class Facility {
    private String serviceName  ;
    private int usableArea;
    private double cost;
    private int numbeOPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, double cost, int numbeOPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.cost = cost;
        this.numbeOPeople = numbeOPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
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

    public int getNumbeOPeople() {
        return numbeOPeople;
    }

    public void setNumbeOPeople(int numbeOPeople) {
        this.numbeOPeople = numbeOPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  " serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", cost=" + cost +
                ", numbeOPeople=" + numbeOPeople +
                ", rentalType=" + rentalType + '\''
                ;
    }
}
