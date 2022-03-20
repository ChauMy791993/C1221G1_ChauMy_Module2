package case_study_module_2.furama_resort.models.person;

import case_study_module_2.furama_resort.enums.CustomerType;

public class Customer extends Person{
    private String customerID;
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String gender, long idNumber, String phoneNumber,
                    String email, String customerID, CustomerType customerType, String address) {
        super(name, dayOfBirth, gender, idNumber, phoneNumber, email);
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
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

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV()+","+customerID+","+customerType+","+address;
    }
}
