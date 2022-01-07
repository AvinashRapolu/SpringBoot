package com.avinash.DBP;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "People")
public class PEntity {
    @Id
    @Column @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    @NotEmpty(message = "name cant be empty") @NotNull(message = "name cant be null")
    private String name;
    @Column
    private String dob;
    @Column
    private int age;
    @Column
    private long phone;

    public PEntity() {
    }

    public PEntity(int id,String name, String dob, int age, long phone) {
        this.id = id;
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

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }
}
