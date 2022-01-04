package com.avinash.SpringPrac;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
public class Product
{
    @NotEmpty(message = "product name cannot be empty.")
    private String pName;
    @Email(message = "give a valid email address")
    private String mail;
  @AgeValidator
    private int pId;
    private List<Skus> sk;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public List<Skus> getSk() {
        return sk;
    }

    public void setSk(List<Skus> sk) {
        this.sk = sk;
    }
}
