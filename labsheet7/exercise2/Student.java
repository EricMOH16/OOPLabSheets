package labsheet7.exercise2;

public class Student {
    private int id;
    private String studentName;
    private String department;

    public Student( String studentName, int id, String department){
        setId(id);
        setStudentName(studentName);
        setDepartment(department);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return  "\nName: " + getStudentName()+  " ID: " + getId() + " Department: " + getDepartment();
    }
}
