package myCharStream.demo05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/21 20:37
 */
/*
    需求：键盘录入5个学生信息，（姓名，语文成绩，数学成绩，英语成绩）。要求按成绩总分从高到低写入文本文件
         格式：姓名，语文成绩，数学成绩，英语成绩       举例：孙悟空，90，90，60
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                int num1 = num == 0 ? o2.getChinese() - o1.getChinese() : num;
                int num2 = num1 == 0 ? o2.getMath() - o2.getMath() : num1;
                int num3 = num2 == 0 ? o2.getName().compareTo(o1.getName()) : num2;

                return num3;
            }
        });

        // 键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第" + (i+1) + "个学生的信息");
            System.out.println("姓名：");
            String name = scanner.next();
            System.out.println("语文成绩：");
            int chinese = scanner.nextInt();
            System.out.println("数学成绩：");
            int math = scanner.nextInt();
            System.out.println("英语成绩：");
            int english = scanner.nextInt();

            // 创建学生对象
            Student student = new Student(name,chinese,math,english);
            ts.add(student);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/java文件操作/demo02/3.txt"));
        for ( Student s : ts ) {
            StringBuffer sb = new StringBuffer();
            StringBuffer append =
                    sb.append(s.getName()).append(",").append(s.getChinese()).append(",")
                            .append(s.getMath()).append(",").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
    }
}
