package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Facility;
import case_study_module_2.furama_resort.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    protected String serviceName  ;
    protected int usableArea;
    protected double cost;
    protected int numberOfPeople;
    protected String rentalType;
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityIntegerMap;
    }

    public static void setFacilityIntegerMap(Map<Facility, Integer> facilityIntegerMap) {
        FacilityServiceImpl.facilityIntegerMap = facilityIntegerMap;
    }

    @Override
    public void maintenanceList() {
        for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
           if (facility.getValue()==5){
               System.out.println(facility.getKey()+", number of uses : "+facility.getValue());
           }
        }
    }

    @Override
    public void create(Facility facility) {
        facilityIntegerMap.put(facility, 0);

    }

    @Override
    public void read() {
        for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
            System.out.println(facility);
        }

    }

    @Override
    public void update(int index) {

    }
}
