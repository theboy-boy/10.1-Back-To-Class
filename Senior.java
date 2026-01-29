public class Senior extends HighSchoolStudent{
    protected boolean senioritis = false;
    public Senior(String name, int age, String gender, String idNum, double gpa, int hStudentYear, String hStudentMajor, boolean senioritis) {
        super(name, age, gender, idNum, gpa, hStudentYear, hStudentMajor);
        this.senioritis = senioritis;
    }
    public boolean isSenioritis() {
        return senioritis;
    }
    public void setSenioritis(boolean senioritis) {
        this.senioritis = senioritis;
    }
    public String toString() {
        return super.toString()+"senioritis:" + senioritis;
    }
    
}
