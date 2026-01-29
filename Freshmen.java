public class Freshmen extends HighSchoolStudent{
    protected String sport = "N/A";
    public Freshmen(String name, int age, String gender, String idNum, double gpa, int hStudentYear, String hStudentMajor, String sport) {
        super(name, age, gender, idNum, gpa, hStudentYear, hStudentMajor);
        this.sport = sport;
    }
    public String getSport() {
        return sport;
    }
    public void setSport(String sport) {
        this.sport = sport;
    }
    public String toString() {
        return super.toString() + ", sport: "+sport;
    }
}
