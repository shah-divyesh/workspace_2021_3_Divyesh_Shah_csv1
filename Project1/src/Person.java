public class Person {
    private int id;
    private int age;
    private String lastName;
    private String firstName;
    private String parentFirstName;
    private String parentLastName;

    public Person() {
    }

    public Person(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
        this.id = id;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public static void demo(){
        System.out.println("Person Class demo method called");
    }

    @Override
    public String toString() {
        return  " id = " + id +
                ", age = " + age +
                ", lastName = '" + lastName + '\'' +
                ", firstName = '" + firstName + '\'' +
                ", parentFirstName = '" + parentFirstName + '\'' +
                ", parentLastName = '" + parentLastName + '\'' ;
    }
}
