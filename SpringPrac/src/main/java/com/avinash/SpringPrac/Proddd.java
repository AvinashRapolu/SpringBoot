package com.avinash.SpringPrac;

import lombok.Data;

import java.util.List;
@Data
public class Proddd {
    private List<Product> item;

    public List<Product> getItem() {
        return item;
    }

    public void setItem(List<Product> item) {
        this.item = item;
    }
}
