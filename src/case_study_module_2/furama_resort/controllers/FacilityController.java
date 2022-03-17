package case_study_module_2.furama_resort.controllers;

import case_study_module_2.furama_resort.models.facility.Villa;
import case_study_module_2.furama_resort.services.iplm.FacilityServiceImpl;
import case_study_module_2.furama_resort.services.iplm.HouseServiceImpl;
import case_study_module_2.furama_resort.services.iplm.RoomServiceImpl;
import case_study_module_2.furama_resort.services.iplm.VillaServiceImpl;

public class FacilityController {
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    VillaServiceImpl villaService = new VillaServiceImpl();
    HouseServiceImpl houseService = new HouseServiceImpl();
    RoomServiceImpl roomService = new RoomServiceImpl();

    public void displayMaintenanceList(){
        facilityService.maintenanceList();
    }

    public void displayFacilityList() {
        facilityService.read();
    }
    public void addNewFacility(int choice){
        switch (choice){
            case 1:
                villaService.addNewVilla();
                break;
            case 2:
                houseService.addNewHouse();
                break;
            case 3:
                roomService.addNewRoom();
            case 4:
                break;
            default:
                System.out.println("wrong number");
        }

    }
}
