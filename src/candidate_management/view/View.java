package candidate_management.view;


import candidate_management.controllers.CandidateController;

public class View {
    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController();
        candidateController.mainMenu();
    }
}
