package com.avinash.DbDemo.Controller;

import com.avinash.DbDemo.Model.Mobile;
import com.avinash.DbDemo.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlPanel {
    @Autowired
    Services service;
    @PostMapping("/add-update")
    public String add(@RequestBody Mobile mobile)
    {
       return service.upsert(mobile);
    }
}
