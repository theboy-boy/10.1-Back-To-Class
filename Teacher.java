public class Teacher extends Person{
    private double teacherSalary = 0.0;
    private String teacherSubject = "";
    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        teacherSalary = salary;
        teacherSubject = subject;
    }
    public String getSubject(){
        return teacherSubject;
    }
    public String setSubject(String newSubject){
        teacherSubject = newSubject;
        return teacherSubject;
    }
    public double getSalary(){
        return teacherSalary;
    }
    public double setSalary(double newSalary){
        teacherSalary = newSalary;
        return teacherSalary;
    }
    public String toString(){
        return super.toString() + "subject: " + teacherSubject + "salary: " + teacherSalary;
    }
}