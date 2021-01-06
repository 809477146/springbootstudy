package com.amarsoft.java;

import com.amarsoft.java.pojo.Person;
import com.amarsoft.java.util.Gender;

import java.io.*;

public class SimpleSerial {
    public static void main(String[] args) throws Exception {
        File file = new File("person.out");

        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 101, Gender.MALE);

        System.out.println(person instanceof Serializable);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        System.out.println(newPerson);
    }
}
