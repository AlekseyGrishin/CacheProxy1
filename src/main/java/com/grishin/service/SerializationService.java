package com.grishin.service;

import java.io.*;

public class SerializationService {
    public static File serialize(Object o, String fileName) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream(fileName));
            outputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new File(fileName);
    }
    private <T> T deSerialize(String fileName) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream(fileName));
            return (T) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
