package com.avinash.SpringPrac;

import lombok.Data;

import java.util.List;
@Data
public class Product
{
    private String pName;
    private int pId;
    private List<Skus> sk;

//    public String getpName() {
//        return pName;
//    }
//
//    public void setpName(String pName) {
//        this.pName = pName;
//    }
//
//    public int getpId() {
//        return pId;
//    }
//
//    public void setpId(int pId) {
//        this.pId = pId;
//    }
//
//    public List<Skus> getSk() {
//        return sk;
//    }
//
//    public void setSk(List<Skus> sk) {
//        this.sk = sk;
//    }
}
