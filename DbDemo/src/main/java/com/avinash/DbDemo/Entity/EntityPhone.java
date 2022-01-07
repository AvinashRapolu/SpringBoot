package com.avinash.DbDemo.Entity;

import com.avinash.DbDemo.Model.Os;
import com.avinash.DbDemo.Model.Specs;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class EntityPhone {
    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String phoneName;
    @Column
    private String company;
    @Column
    private String model;
    @Column
    private double price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EntitySpecs_id",referencedColumnName = "id")
    private EntitySpecs specs;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EntityOs_id",referencedColumnName = "id")
    private EntityOs os;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EntitySpecs getSpecs() {
        return specs;
    }

    public void setSpecs(EntitySpecs specs) {
        this.specs = specs;
    }

    public EntityOs getOs() {
        return os;
    }

    public void setOs(EntityOs os) {
        this.os = os;
    }
}
