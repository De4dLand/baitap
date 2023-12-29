package com.example.listviewcus;

public class Contact {
    private String Avatar;
    private String Name;
    private String Phone;

    public Contact(String avatar, String name, String phone) {
        Avatar = avatar;
        Name = name;
        Phone = phone;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
