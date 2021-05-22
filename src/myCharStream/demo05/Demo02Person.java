package myCharStream.demo05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/21 19:58
 */
/*
    需求:
        把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行的数据是一个Person类对象的成员变量值
        举例：01,孙悟空,1000,花果山
    思路：
        1 定义Person类
        2 创建字符缓冲输入流
        3 创建ArrayList集合对象
        4 调用字符缓冲输入流对象的方法读数据
        5 把读到的字符串用split()进行分割，得到一个字符串
        6 创建Person对象
        7 把字符串数组中的每一个元素取出来对应的赋值给Person对象的成员变量值
        8 把Person对象添加到集合
        9 释放资源
 */
public class Demo02Person {
    public static void main(String[] args) throws IOException {
//        2 创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\java文件操作\\demo02\\2.txt"));
//        3 创建ArrayList集合对象
        ArrayList<Person> array= new ArrayList<>();
//        4 调用字符缓冲输入流对象的方法读数据
        String line;
        while ( (line = br.readLine()) != null ) {
//            5 把读到的字符串用split()进行分割，得到一个字符串
            String[] split = line.split(",");
//            6 创建Person对象
            Person p = new Person();
//            7 把字符串数组中的每一个元素取出来对应的赋值给Person对象的成员变量值
            p.setSid(split[0]);
            p.setName(split[1]);
            p.setAge(Integer.parseInt(split[2]));
            p.setAddress(split[3]);
//            8 把Person对象添加到集合
            array.add(p);
        }

        // 遍历集合
        for ( Person p : array ) {
            System.out.println(p.getSid() + "," + p.getName() + "," + p.getAge() + "," + p.getAddress());
        }
//        9 释放资源
        br.close();




    }
}
