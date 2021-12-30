package com.avinash.SpringPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
//    Services ser = new Services()
    private Services services;

    @PostMapping ("/add")
            public void add(@RequestBody Product product)
    {
        services.add(product);
    }
    @RequestMapping("/del")
    public void del(@RequestParam String product)
    {
        services.del(product);
    }

    @GetMapping("/getall")

    public List getAll()
    {
        return services.getAll();
    }

}
