package case_study_module_2.furama_resort.models.person;

public abstract class Person {
    private String name;
    private String dayOfBirth;
    private String gender;
    private long numberID;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String sex, long idNumber, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = sex;
        this.numberID = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getNumberID() {
        return numberID;
    }

    public void setNumberID(long numberID) {
        this.numberID = numberID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", sex='" + gender + '\'' +
                ", idNumber=" + numberID +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\''
                ;
    }
}
