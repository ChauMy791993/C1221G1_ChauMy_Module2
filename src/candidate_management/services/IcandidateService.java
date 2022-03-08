package candidate_management.services;

import candidate_management.model.Candidate;

import java.util.ArrayList;

public interface IcandidateService {
    ArrayList<Candidate> candidateArrayList = new ArrayList<>();
    void create();
    void read();
    void update();
    void delete();
    void search();
    void baseInformation();
}
