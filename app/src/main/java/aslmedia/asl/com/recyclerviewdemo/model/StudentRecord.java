package aslmedia.asl.com.recyclerviewdemo.model;

/**
 * Created by Amardeep on 2/13/2017.
 */

public class StudentRecord {
    private String name;
    private String sex;
    private String address;
    private int age;

    public StudentRecord(String name, String sex, String address, int age)
    {
        this.name=name;
        this.sex=sex;
        this.address=address;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
