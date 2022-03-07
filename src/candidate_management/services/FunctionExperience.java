package candidate_management.services;

import candidate_management.model.Candidate;
import candidate_management.model.Experience;

import java.util.ArrayList;
import java.util.List;

public class FunctionExperience implements IFunctions<Experience> {
    public static List<Candidate> experienceList = new ArrayList<>();

    public FunctionExperience() {
    }

    public FunctionExperience(List<Candidate> experienceList) {
        this.experienceList = experienceList;
    }

    public static List<Candidate> getExperienceList() {
        return experienceList;
    }

    public static void setExperienceList(List<Candidate> experienceList) {
        FunctionExperience.experienceList = experienceList;
    }

    @Override
    public void add(Experience experience) {
        this.experienceList.add(experience);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        for (Candidate experience : experienceList) {
            System.out.println(experience);
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean result = false;
        name = name.toLowerCase();
        for (Candidate experience : experienceList) {
            boolean isContainFirstName = experience.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = experience.getLastName().toLowerCase().contains(name);
            if (isContainFirstName || isContainLastName) {
                System.out.println(experience);
                result = true;
            }
        }
        return result;
    }
}

