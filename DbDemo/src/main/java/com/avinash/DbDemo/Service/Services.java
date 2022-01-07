package com.avinash.DbDemo.Service;

import com.avinash.DbDemo.Entity.EntityOs;
import com.avinash.DbDemo.Entity.EntityPhone;
import com.avinash.DbDemo.Entity.EntitySpecs;
import com.avinash.DbDemo.Model.Mobile;
import com.avinash.DbDemo.Model.Phone;
import com.avinash.DbDemo.Repository.RepositoryPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class Services {
    @Autowired
     RepositoryPhone repositoryPhone;

    public String upsert(Mobile mobile) {
//        Optional<EntityPhone>  phones =repositoryPhone.findById(id);
//        if(phones.isPresent())
//        {
//            EntityPhone entityPhone=new EntityPhone();
//
//            entityPhone.setPhoneName(mobile.getPhone().getPhoneName());
//            entityPhone.setModel(mobile.getPhone().getModel());
//            entityPhone.setCompany(mobile.getPhone().getCompany());
//            entityPhone.setPrice(mobile.getPhone().getPrice());
//
//            EntitySpecs entitySpecs =new EntitySpecs();
//
//            entitySpecs.setRamAndType(mobile.getSpecs().getRamAndType());
//            entitySpecs.setRomAndType(mobile.getSpecs().getRomAndType());
//            entitySpecs.setProcessor(mobile.getSpecs().getProcessor());
//            entitySpecs.setDisplayAndType(mobile.getSpecs().getDisplayAndType());
//
//            entityPhone.setSpecs(entitySpecs);
//
//            EntityOs entityOs=new EntityOs();
//
//            entityOs.setOsName(mobile.getOs().getOsName());
//            entityOs.setBasedOn(mobile.getOs().getBasedOn());
//            entityOs.setVersionNo(mobile.getOs().getVersionNo());
//
//            entityPhone.setOs(entityOs);
//
//            repositoryPhone.save(entityPhone);
//
//            return "Phone is updated";
//        }
//        else
//        {
        EntityPhone entityPhone = new EntityPhone();

        entityPhone.setPhoneName(mobile.getPhone().getPhoneName());
        entityPhone.setModel(mobile.getPhone().getModel());
        entityPhone.setCompany(mobile.getPhone().getCompany());
        entityPhone.setPrice(mobile.getPhone().getPrice());

        EntitySpecs entitySpecs = new EntitySpecs();

        entitySpecs.setId(mobile.getPhone().getId());
        entitySpecs.setRamAndType(mobile.getSpecs().getRamAndType());
        entitySpecs.setRomAndType(mobile.getSpecs().getRomAndType());
        entitySpecs.setProcessor(mobile.getSpecs().getProcessor());
        entitySpecs.setDisplayAndType(mobile.getSpecs().getDisplayAndType());

        entityPhone.setSpecs(entitySpecs);

        EntityOs entityOs = new EntityOs();

        entityOs.setId(mobile.getPhone().getId());
        entityOs.setOsName(mobile.getOs().getOsName());
        entityOs.setBasedOn(mobile.getOs().getBasedOn());
        entityOs.setVersionNo(mobile.getOs().getVersionNo());

        entityPhone.setOs(entityOs);

        repositoryPhone.save(entityPhone);
        return "phone is added";
//    }
    }
}
