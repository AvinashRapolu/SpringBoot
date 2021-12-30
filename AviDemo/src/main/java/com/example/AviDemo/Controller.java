package com.example.AviDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class Controller
{
    @GetMapping("/reg")
    public String st()
    {
        String a="aaaaaa ";
        String b= "bbbbbbb";
        return a+b;
    }

}
