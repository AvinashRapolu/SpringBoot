package com.avinash.DataBase.Controller;

import com.avinash.DataBase.Model.Dealer;
import com.avinash.DataBase.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    public Service service;

    @PostMapping("/add-dealer")
    public void add(@RequestBody Dealer dealer)
    {
        service.add(dealer);
    }

    @GetMapping("/all-dealers")
    public List getAll()
    {
        return service.getAll();
    }
//
//    @RequestMapping("/del-dealer")
//    public void del(@RequestParam String dealer)
//    {
//        service.del(dealer);
//    }
}
