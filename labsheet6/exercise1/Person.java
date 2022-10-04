package labsheet6.exercise1;

public class Person {

    private String firstName;
    private String lastName;

    public Person(){
        this("Not supplied","Not supplied");
    }

    public Person(String firstName,String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){

      return   "First name: " + getFirstName() + "  Last Name: " + getLastName();
    }
}
