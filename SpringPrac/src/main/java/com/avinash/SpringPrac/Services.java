package com.avinash.SpringPrac;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Services {

    private List<Product> products=new ArrayList<>();


    public void add(Product product)
    {
        products.add(product);
    }


    public List<Product> getAll()
    {
        return products;
    }
    public void del(String product)
    {
        products.remove(products.stream().filter(p ->p.getPName().equals(product)).findFirst().orElse(null));
    }

}
