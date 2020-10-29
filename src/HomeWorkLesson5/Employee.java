package HomeWorkLesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long telefon;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long telefon, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
        toString();
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefon() {
        return telefon;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telefon=" + telefon +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
