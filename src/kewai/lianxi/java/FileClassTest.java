package kewai.lianxi.java;

import java.io.File;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class FileClassTest {
    public static void main(String[] args) {
        //File file=new File("e:/test.txt");
        //System.out.println(file.exists());
        File file=new File("e:/我的照片");
        file.mkdir();
    }
}
