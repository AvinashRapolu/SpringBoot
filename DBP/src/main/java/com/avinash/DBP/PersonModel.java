package com.avinash.DBP;

public class PersonModel {
    private int id;
    private String name;
    private String dob;
    private int age;
    private long phone;

    public PersonModel() {
    }

    public PersonModel(int id,String name, String dob, int age, long phone) {
        this.id=id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
