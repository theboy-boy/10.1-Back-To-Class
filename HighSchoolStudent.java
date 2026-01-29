public class HighSchoolStudent extends Student{
    protected int hStudentYear ;
    protected String hStudentMajor;
    public HighSchoolStudent(String name, int age, String gender, String idNum, double gpa, int hStudentYear,
            String hStudentMajor) {
        super(name, age, gender, idNum, gpa);
        this.hStudentYear = hStudentYear;
        this.hStudentMajor = hStudentMajor;
    }
    public int gethStudentYear() {
        return hStudentYear;
    }
    public void sethStudentYear(int hStudentYear) {
        this.hStudentYear = hStudentYear;
    }
    public String gethStudentMajor() {
        return hStudentMajor;
    }
    public void sethStudentMajor(String hStudentMajor) {
        this.hStudentMajor = hStudentMajor;
    }
    public String toString() {
        return super.toString() + ", student year: " + hStudentYear + ", student major: " + hStudentMajor;
    }
}