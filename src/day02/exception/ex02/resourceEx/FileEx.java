package day02.exception.ex02.resourceEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args)  {
        FileWriter file1 = null;
        FileWriter file2 = null;
        //win : ctrl+alt+T   mac : option+command + T
        try {
            file1  = new FileWriter("data.txt");
            file1.write("Java Advanced Programming1");

            file2  = new FileWriter("data1.txt");
            file2.write("Java Advanced Programming2");

        } catch (IOException e) {
            throw  new RuntimeException(e);
        } finally {
            try {
                file1.close();
                file2.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}