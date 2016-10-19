package kewai.lianxi.java;

import java.io.File;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class FileMethod1Test {
    public static void main(String[] args) {
        File file=new File("e:/");
        //String[]s =file.list();
        //for (String s1 : s)
        //    System.out.println(s1);
        System.out.println(file.isDirectory());
    }
}