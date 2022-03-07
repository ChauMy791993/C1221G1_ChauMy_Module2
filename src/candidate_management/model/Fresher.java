package candidate_management.model;

import java.util.Objects;

public class Fresher extends Candidate {
    private int graduatedTime;
    private String rankOfGraduation;
    private String university;

    public Fresher() {
    }

    public Fresher(int graduatedTime, String rankOfGraduation, String university) {
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.university = university;
    }

    public Fresher(String id, String firstName, String lastName, String birth, String address, String phone, String email, int candidateType, int graduatedTime, String rankOfGraduation, String university) {
        super(id, firstName, lastName, birth, address, phone, email, candidateType);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.university = university;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduatedTime=" + graduatedTime +
                ", rankOfGraduation=" + rankOfGraduation +
                ", university='" + university + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fresher)) return false;
        Fresher that = (Fresher) o;
        return super.getId() == that.getId();
    }
}
