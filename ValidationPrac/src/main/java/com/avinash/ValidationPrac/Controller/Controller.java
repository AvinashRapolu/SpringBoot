package com.avinash.ValidationPrac.Controller;

import com.avinash.ValidationPrac.Model.Person;
import com.avinash.ValidationPrac.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    public Services services;

    @PostMapping("/add/")
    public void add(@Valid @RequestBody Person person)
    {
        services.add(person);
    }

    @GetMapping("/all")
    public List<Person> all()
    {
        return services.all();
    }
}
