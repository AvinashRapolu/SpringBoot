package com.avinash.SpringEmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class ControllerEmp {
    @Autowired
    private ServicesEmp servicesEmp;

    @RequestMapping("/add-employee")
    public void add(@RequestParam String id, @RequestParam String name)
    {
        servicesEmp.add(id, name);
    }

    @GetMapping("/get-employees")
    public Map<String, String> getAll() {
        return servicesEmp.getAll();
    }

    @GetMapping("/get-employee/{id}")
    public String getEmployee(@PathVariable String id) {
        return servicesEmp.get(id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return servicesEmp.delete(id);
    }

}
