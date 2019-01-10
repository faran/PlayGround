public class Person {

    private String FirstName;
    private String LastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age){
        super();
        this.FirstName = firstName;
        this.LastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + FirstName + " Last Name: " + LastName + " Age: " + age;
    }
}
