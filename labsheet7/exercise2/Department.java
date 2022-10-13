package labsheet7.exercise2;

import java.util.Arrays;

public class Department {
    private String departmentName;
    private Student students[];

    public Department(String departmentName,Student students[]){
        setDepartmentName(departmentName);
        setStudents(students);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String str =  "\nDepartment Name: " + getDepartmentName() + "\nList of Students: \n\n";

        for (int i = 0;i<getStudents().length;i++){
            if(students[i]!=null)
                str+=students[i];
            return str;
        }


    }
}
