package case_study_module_2.furama_resort.models;

import case_study_module_2.furama_resort.models.facility.Facility;
import case_study_module_2.furama_resort.models.person.Customer;

public class Booking {
    private String bookingID;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;


    public Booking() {
    }

    public Booking(String bookingID, String startDate, String endDate, Customer customer, Facility facility) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }
}
