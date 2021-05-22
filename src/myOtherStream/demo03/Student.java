package myOtherStream.demo03;

import java.io.Serializable;

/**
 * @author 王艺博
 * @date 2021/5/22 19:54
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
//    private int age;
    // 加上transient 关键字可不被序列化
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

}
