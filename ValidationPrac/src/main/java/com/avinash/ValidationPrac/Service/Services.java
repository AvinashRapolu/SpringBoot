package com.avinash.ValidationPrac.Service;

import com.avinash.ValidationPrac.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Services
{

    List<Person> personList=new ArrayList<>();

    public void add(Person person)
    {
        personList.add(person);
    }

    public List<Person> all()
    {
        return personList;
    }
}
