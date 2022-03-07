package candidate_management.services;

import candidate_management.model.Candidate;
import candidate_management.model.Experience;
import candidate_management.model.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionFresher implements IFunctions<Fresher> {
    public List<Candidate> fresherList = new ArrayList<>();

    public FunctionFresher(List<Candidate> fresherList) {
        this.fresherList = fresherList;
    }

    public FunctionFresher() {
    }

    public List<Candidate> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Candidate> fresherList) {
        this.fresherList = fresherList;
    }

    @Override
    public void add(Fresher object) {
        this.fresherList.add(object);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        for (Candidate fresher : fresherList) {
            System.out.println(fresher);
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean result = false;
        name = name.toLowerCase();
        for (Candidate fresher : fresherList) {
            boolean isContainFirstName = fresher.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = fresher.getLastName().toLowerCase().contains(name);
            if (isContainFirstName || isContainLastName) {
                System.out.println(fresher);
                result = true;
            }
        }
        return result;
    }
}
