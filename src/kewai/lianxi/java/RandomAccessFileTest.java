package kewai.lianxi.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception {
        File file=new File("e:/test.txt");
        RandomAccessFile randomAccessFile=null;
        randomAccessFile=new RandomAccessFile(file,"rw");
        String name=null;
        int age=0;
        name="aaaaaaaa";
        randomAccessFile.writeBytes(name);
        randomAccessFile.writeInt(age);
        name="bbbb";
        age=31;
        randomAccessFile.writeBytes(name);
        randomAccessFile.writeInt(age);
        name="cccccc";
        age=32;
        randomAccessFile.writeBytes(name);
        randomAccessFile.writeInt(age);
        randomAccessFile.close();




    }
}
