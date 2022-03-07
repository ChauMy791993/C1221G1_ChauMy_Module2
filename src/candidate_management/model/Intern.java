package candidate_management.model;

import java.util.Objects;

public class Intern extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String firstName, String lastName, String birth, String address, String phone, String email, int candidateType, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birth, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intern)) return false;
        Intern that = (Intern) o;
        return super.getId() == that.getId();
    }
}
