package model;

import java.io.Serializable;

public class Customer implements Serializable {
    int Id;
    String Name;
    String Address;

    public Customer(){
    }

    public Customer(int id, String name, String address) {
        Id = id;
        Name = name;
        Address = address;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
