package Test.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

   public Person(String firstName, String lastName, int age, double salary){
        this. firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
       return String.format("%s %s gets %2f leva.",
               this.getFirstName(),
               this.getLastName(),
               this.getSalary());
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() <= 30) {
            bonus /= bonus / 2.0;
        }
        bonus /= 100;

        double increasedSalary = this.getSalary() * (1 + bonus);

        this.setSalary(increasedSalary);
    }
}
