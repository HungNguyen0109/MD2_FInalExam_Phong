package service;

import config.ConfigReadAndWrite;
import model.Contact;

import java.util.List;

public class ContactSerVice {
    public static String PATH = "src/data/contactData.txt";
    public static ConfigReadAndWrite configReadAndWrite = new ConfigReadAndWrite();
    public static List<Contact> contactList = configReadAndWrite.readFromFile(PATH);

    public List<Contact> findAll(){
        return contactList;
    }

    public void save(Contact contact){
        contactList.add(contact);
    }

    public void editByPhonenumber(String phonenumber){

    }

    public Contact findByPhonenumber(String phonenumber){
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhonenumber().equals(phonenumber)){
                return contactList.get(i);
            }
        }
        return null;
    }

    public Contact findByName(String name){
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)){
                return contactList.get(i);
            }
        }
        return null;
    }

    public void deleteContact(Contact contact){
        contactList.remove(contact);
    }

    public void readFromFile(){
        contactList = configReadAndWrite.readFromFile(PATH);
    }

    public void writeToFile(){
        configReadAndWrite.writeToFile(PATH, contactList);
    }
}
