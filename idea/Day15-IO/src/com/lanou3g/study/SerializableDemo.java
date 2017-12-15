package com.lanou3g.study;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializableDemo {
    @Test
    public void output() throws IOException {
        Pet pet = new Pet("雪纳瑞","male");
        FileOutputStream fos = new FileOutputStream("src/pet.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pet);
        oos.flush();
       oos.close();
    }
}
