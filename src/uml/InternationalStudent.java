package uml;

public class InternationalStudent extends Student {

    private String visaStatus;
    private String countryOfOrigin;

    public InternationalStudent(int studentId, int studentAge, String studentName, Address studentAddress) {
        super(studentId, studentAge, studentName, studentAddress);
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
