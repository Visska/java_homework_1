package homework5;

public class Employee {
    private String fullName;
    private int age;
    private String position;
    private String email;
    private String telephone;
    private int wages;

    public Employee(String fullName, int age, String position, String email, String telephone, int wages){
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wages = wages;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getWages() {
        return wages;
    }

    public void printInfo(){
        System.out.println(
                "Full Name: " + this.fullName +
                " Age: " + this.age +
                " Position: " + this.position +
                " Email: " + this.email +
                " Telephon: " + this.telephone +
                " Wages: " + this.wages);
    }
}