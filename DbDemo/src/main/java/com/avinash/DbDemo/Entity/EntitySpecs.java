package com.avinash.DbDemo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Specs")
public class EntitySpecs {
    @Id
    @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String ramAndType;
    @Column
    private String romAndType;
    @Column
    private String processor;
    @Column
    private String displayAndType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRamAndType() {
        return ramAndType;
    }

    public void setRamAndType(String ramAndType) {
        this.ramAndType = ramAndType;
    }

    public String getRomAndType() {
        return romAndType;
    }

    public void setRomAndType(String romAndType) {
        this.romAndType = romAndType;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getDisplayAndType() {
        return displayAndType;
    }

    public void setDisplayAndType(String displayAndType) {
        this.displayAndType = displayAndType;
    }
}
