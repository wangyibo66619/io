package myCharStream.demo06;

import java.io.*;

/**
 * @author 王艺博
 * @date 2021/5/22 14:01
 */
public class CopyFolderDemo02 {
    public static void main(String[] args) throws IOException{
        // 创建源文件File对象
        File srcFile = new File("d:/java文件操作");
        // 创建目的地文件File对象
        File destFile = new File("C:\\Users\\王艺博\\Desktop");

        copyFolder(srcFile,destFile);
    }

    // 复制文件夹
    public static void copyFolder(File srcFile,File destFile) throws IOException {
        // 判断源文件是否为目录
        if (srcFile.isDirectory()) {
            // 创建目的地源文件目录
            File newFolder = new File(destFile,srcFile.getName());
            newFolder.mkdir();
            // 得到源文件目录下全部文件数组
            File[] fileArray = srcFile.listFiles();
            // 遍历数组
            for ( File file : fileArray ) {
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }


    // 复制文件
    public static void copyFile(File srcFile,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ( (len = bis.read(bys)) != -1 ) {
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
