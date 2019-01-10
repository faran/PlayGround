package iterable.collection;

public class Employee {

    private String Name;
    private String Surname;
    private int Id;


    public Employee(String firstName, String secondName, int age){
        super();
        this.Name = firstName;
        this.Surname = secondName;
        this.Id = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "First Name: " + Name + " Last Name: " + Surname + " Age: " + Id;
    }
}