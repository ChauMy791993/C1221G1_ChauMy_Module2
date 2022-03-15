package case_study_module_2.furama_resort.models;

public class Customer extends Person{
    private String customerID;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String sex, long idNumber, long phoneNumber, String email, String customerID, String customerType, String address) {
        super(name, dayOfBirth, sex, idNumber, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                ", customerID='" + customerID + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
