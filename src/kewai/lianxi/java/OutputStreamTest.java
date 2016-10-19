package kewai.lianxi.java;

import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class OutputStreamTest {

    public static void main(String[] args) {
        //OutputStream outputStream=null;
        //try {
        //    outputStream=new FileOutputStream("e:/test.txt");
        //    String s="nanmodizangpusamohesa";
        //    byte[]b =s.getBytes();
        //    outputStream.write(b);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}finally {
        //    if (outputStream!=null){
        //        try {
        //            outputStream.close();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //    }
        //}
        try (OutputStream outputStream=new FileOutputStream("e:/test1.txt")){
            String s="nanmoamituofo";
            byte[]b =s.getBytes();
            outputStream.write(b);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
