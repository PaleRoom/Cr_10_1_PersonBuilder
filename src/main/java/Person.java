public class Person {
    protected final String name;
    protected final String surname;

    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    public boolean hasAge() {
        return this.age >= 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname
                + (hasAddress() ? " из города " + this.address : "неизвестен,")
                + (hasAge() ? " возраст " + this.age : "неизвестен");
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }
}
