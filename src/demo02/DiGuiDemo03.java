package demo02;

import java.io.File;

/**
 * @author 王艺博
 * @date 2021/5/19 9:53
 */
// 给定一个路径，通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
public class DiGuiDemo03 {
    public static void main(String[] args) {
        // 根据给定的路径创建一个File对象
        File file = new File("D:/KwDownload");
        // 调用方法
        getAllFilePath(file);

    }

    public static void getAllFilePath(File srcFile) {
        // 获取给定的File目录下所有的文件或者目录的File数组
        File[] files = srcFile.listFiles();
        // 遍历该File数组，得到每一个File对象
        if ( files != null ) {
            for (File f : files) {
                // 判断该File对象是否是目录
                if ( f.isDirectory() ){
                    // 递归调用
                    getAllFilePath(f);
                }else {
                    // 不是目录的话将绝对路径输出在控制台
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

}
