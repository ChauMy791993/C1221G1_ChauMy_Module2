package candidate_management.services;

import candidate_management.model.Candidate;
import candidate_management.model.Intern;

import java.util.ArrayList;
import java.util.List;

public class FunctionInternship implements IFunctions<Intern> {
    public List<Candidate> internList = new ArrayList<>();

    public FunctionInternship(List<Candidate> interList) {
        this.internList = interList;
    }

    public FunctionInternship() {
    }

    public List<Candidate> getInternList() {
        return internList;
    }

    public void setInternList(List<Candidate> internList) {
        this.internList = internList;
    }

    @Override
    public void add(Intern object) {
        this.internList.add(object);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        for (Candidate intern : internList) {
            System.out.println(intern);
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean result = false;
        name = name.toLowerCase();
        for (Candidate intern : internList) {
            boolean isContainFirstName = intern.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = intern.getLastName().toLowerCase().contains(name);
            if (isContainFirstName || isContainLastName) {
                System.out.println(intern);
                result = true;
            }
        }
        return result;
    }
}
