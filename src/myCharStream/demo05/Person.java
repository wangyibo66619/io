package myCharStream.demo05;

/**
 * @author 王艺博
 * @date 2021/5/21 19:26
 */
public class Person {
    private String sid;
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String sid, String name, int age, String address) {
        this.name = name;
        this.sid = sid;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
