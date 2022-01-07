package com.avinash.DBP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PController {

    @Autowired
    PService service;

    @RequestMapping("/add")
    public void add(@Valid @RequestBody PersonModel personModel)
    {
        service.add(personModel);
    }

    @GetMapping("/all")
    public List all()
    {
        return service.all();
    }

    @RequestMapping("/by-name/{name}")
    public List<PersonModel> getByName(@PathVariable String name)
    {
        return service.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id)
    {
        service.delete(id);
    }
    @PutMapping("/update")
    public String update(@RequestBody PersonModel personModel)
    {
        return service.update(personModel);
    }
    @PutMapping("/upsert/{id}")
    public String upsert(@RequestBody PersonModel personModel,@PathVariable int id)
    {
        return service.upsert(personModel,id);
    }


//    @RequestMapping("del")
//    public void del(@RequestParam String name)
//    {
//        service.getByName(name);
//    }
}
