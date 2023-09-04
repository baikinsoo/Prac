package test0904;

public class Memeber {
    private String name;
    private int age;
    private String phoneNum;
    private String city;

    public Memeber(String name, int age, String phoneNum, String city) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Memeber{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
