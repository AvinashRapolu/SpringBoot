package com.avinash.DataBase.Model;
//
//import java.util.List;

public class Dealer {
    private String name;
    private long phone;
    private String office;
//    private List<Cars> car;


    public Dealer() {
    }

    public Dealer(String name, long phone, String office) {
        this.name = name;
        this.phone = phone;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

//    public List<Cars> getCar() {
//        return car;
//    }
//
//    public void setCar(List<Cars> car) {
//        this.car = car;
//    }
}
