package com.avinash.DbDemo.Model;

import com.avinash.DbDemo.Entity.EntityOs;
import com.avinash.DbDemo.Entity.EntityPhone;
import com.avinash.DbDemo.Entity.EntitySpecs;

public class Mobile {
    private Phone phone;
    private Specs specs;
    private Os os;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }
}
