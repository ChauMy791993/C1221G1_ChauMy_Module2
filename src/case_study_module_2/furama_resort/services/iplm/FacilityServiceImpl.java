package case_study_module_2.furama_resort.services.iplm;

import case_study_module_2.furama_resort.models.facility.Facility;
import case_study_module_2.furama_resort.services.IFacilityService;
import case_study_module_2.furama_resort.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    protected String serviceName;
    protected double usableArea;
    protected double cost;
    protected int numberOfPeople;
    protected String rentalType;
    protected static final String REGEX_STRING = "^[A-Z][a-z]*$";
    protected static final String REGEX_AREA = "^([3-9][1-9]|\\d{3,})(.\\d{1,})?$";
    protected static final String REGEX_COST_FLOOR = "^[1-9]\\d*$";
    protected static final String REGEX_PEOPLE = "^([1-9]|(1\\d))$";
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
            if (facility.getValue() == 5) {
                System.out.println(facility.getKey() + ", number of uses : " + facility.getValue());
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

}
