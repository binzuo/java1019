package kewai.lianxi.java;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class FileTest {
    public static void main(String[] args) {
        File file=new File("e:/test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("pathSeparator:"+File.pathSeparator);//;
        System.out.println("separator:"+File.separator);//\
    }
}
