package myOtherStream.demo04;

import java.util.Properties;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/22 21:20
 */
/*
    Properties作为集合的特有方法：
        Object setProperty(String key, String value) 调用 Hashtable方法 put 。
        String getProperty(String key) 使用此属性列表中指定的键搜索属性。
        Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串，
        包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties prop = new Properties();
        prop.setProperty("01","武松");
        prop.setProperty("02","鲁智深");
        prop.setProperty("03","杨志");

//        String getProperty(String key) 使用此属性列表中指定的键搜索属性。
//        System.out.println( prop.getProperty("01") );
//        System.out.println( prop.getProperty("04") );// null

        //System.out.println(prop);

//        Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串，
        Set<String> names = prop.stringPropertyNames();
        for ( String key : names ) {
            Object value = prop.get(key);
            System.out.println(key + "，" + value);
        }


    }
}
