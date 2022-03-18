package case_study_module_2.furama_resort.services;

import case_study_module_2.furama_resort.models.person.Customer;

public interface ICustomerService extends IServices <Customer>{
    void update(int index);
}
