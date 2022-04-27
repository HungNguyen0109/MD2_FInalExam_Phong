package config;

import model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWrite {
    public List<Contact> contactList = new ArrayList<>();

    public List<Contact> readFromFile(String path){
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            contactList = (List<Contact>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return contactList;
    }

    public void writeToFile(String path, List<Contact> contactList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contactList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
