package com.avinash.DBP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PService {
    @Autowired
    EntityRepository entityRepository;

    public void add(PersonModel person)
    {
        PEntity pEntity=new PEntity();
        pEntity.setName(person.getName());
        pEntity.setDob(person.getDob());
        pEntity.setAge(person.getAge());
        pEntity.setPhone(person.getPhone());
        entityRepository.save(pEntity);
    }

    public List all()
    {
        List<PEntity> list=entityRepository.findAll();
        return list.stream().map(p -> pm(p)).collect(Collectors.toList());
//        return entityRepository.findAll();
    }
    public List<PersonModel> getByName(String name)
    {
        Optional<PEntity> n= entityRepository.findByName(name);

        return n.stream().map(x->pm(x)).collect(Collectors.toList());
    }

    public void delete(Integer id)
    {
        Optional<PEntity> n= entityRepository.findById(id);
            entityRepository.delete(n.get());

    }

    public String update(PersonModel pentity)
    {
        PEntity pEntity=new PEntity();
        pEntity.setId(pentity.getId());
        pEntity.setName(pentity.getName());
        pEntity.setDob(pentity.getDob());
        pEntity.setAge(pentity.getAge());
        pEntity.setPhone(pentity.getPhone());
        entityRepository.save(pEntity);
        return "person is updated";
    }

    public String upsert(PersonModel personModel,int id)
    {
        Optional<PEntity> pEntities= entityRepository.findById(id);
        if(pEntities.isPresent())
        {
            pEntities.stream().forEach(x-> {
                x.setName(personModel.getName());
                x.setAge(personModel.getAge());
                x.setDob(personModel.getDob());
                x.setPhone(personModel.getPhone());
                entityRepository.save(x);
            });
            return "person is updated";
        }
        else
        {
            PEntity pEntity=new PEntity();
            pEntity.setId(personModel.getId());
            pEntity.setName(personModel.getName());
            pEntity.setDob(personModel.getDob());
            pEntity.setAge(personModel.getAge());
            pEntity.setPhone(personModel.getPhone());
            entityRepository.save(pEntity);
            return "person is added";
        }
    }

    private PersonModel pm(PEntity pEntity)
    {
        return new PersonModel(pEntity.getId(),pEntity.getName(),pEntity.getDob(), pEntity.getAge(), pEntity.getPhone());
    }
}
