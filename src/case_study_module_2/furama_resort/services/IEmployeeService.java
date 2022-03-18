package case_study_module_2.furama_resort.services;

import case_study_module_2.furama_resort.models.person.Employee;

public interface IEmployeeService extends IServices <Employee> {
    void update(int index);
}
