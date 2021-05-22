package myCharStream.demo05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/21 19:28
 */
/*
    需求：
        把ArrayList中的学生数据写入到文本文件中。要求：每一个写生对象的数据作为文件中的一行数据
        格式：编号,姓名，年龄，地址            举例：01,孙悟空,1000,花果山
 */
public class DemoPerson {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> person = new ArrayList<>();

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java文件操作\\demo02\\2.txt"));

        Person p1 = new Person("01","孙悟空",1000,"花果山");
        Person p2 = new Person("02","猪八戒",1000,"高老庄");
        Person p3 = new Person("03","沙和尚",1000,"流沙河");
        Person p4 = new Person("04","唐僧",1000,"大唐");

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);


        for ( Person p : person ) {
            StringBuffer sb = new StringBuffer();
            StringBuffer append = sb.append(p.getSid()).append(",").append(p.getName()).append(",").append(p.getAge()).append(",").append(p.getAddress());
            String s = append.toString();
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
