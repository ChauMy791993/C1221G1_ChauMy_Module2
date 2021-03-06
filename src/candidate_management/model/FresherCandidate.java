package candidate_management.model;



public class FresherCandidate extends Candidate {
    private int graduationDate;
    private String graduationRank,education;

    public FresherCandidate() {
    }

    public FresherCandidate(int candidateId, int birthDate, String phone, int candidateType, String firstName, String lastName, String address, String email, int graduationDate, String graduationRank, String education) {
        super(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'';
    }
}
