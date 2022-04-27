package model;

import java.io.Serializable;

public class Contact implements Serializable {
    String phonenumber;
    String group;
    String name;
    String address;
    String birth;
    String email;

    public Contact() {
    }

    public Contact(String phonenumber, String group, String name, String address, String birth, String email) {
        this.phonenumber = phonenumber;
        this.group = group;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phonenumber='" + phonenumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
