public class Student {
    private String name;
    private String lastName;
    private boolean isInRelationship;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isInRelationship() {
        return isInRelationship;
    }

    public void setInRelationship(boolean inRelationship) {
        isInRelationship = inRelationship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
