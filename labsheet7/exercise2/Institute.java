package labsheet7.exercise2;

public class Institute {
    private String instituteName;
    private Department departments[];

    public Institute(String instituteName, Department[] departments){
        setInstituteName(instituteName);
        setDepartments(departments);
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String name) {
        this.instituteName = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] department) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Name: " + getInstituteName() + "Department: " + getDepartments();
    }
}
