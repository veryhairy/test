package homework;

import java.io.*;

public class 反序列化 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fr = new FileInputStream("src/");
        ObjectInputStream ois = new ObjectInputStream(fr);
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
