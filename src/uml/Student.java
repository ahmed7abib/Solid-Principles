package uml;

public class Student implements IActivityLogger {

    private int studentId;
    private int studentAge;
    private String studentName;
    private Address studentAddress;

    public Student(int studentId, int studentAge, String studentName, Address studentAddress) {
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID =" + studentId);
        System.out.println("Student Age =" + studentAge);
        System.out.println("Student Name =" + studentName);
    }

    @Override
    public void logActivity(String activity) {
        System.out.println(activity);
    }

    public void log(String message) {
        LoggingUtils loggingUtils = new LoggingUtils();
        loggingUtils.log("Logged" + message);
    }
}
