package case_study_module_2.furama_resort.services;


import case_study_module_2.furama_resort.models.facility.Facility;

public interface IFacilityService extends IServices<Facility> {
    void maintenanceList();
}
