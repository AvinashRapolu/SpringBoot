package com.avinash.DataBase.Service;

import com.avinash.DataBase.Entity.DealerEntity;
import com.avinash.DataBase.Entity.EntityRepository;
import com.avinash.DataBase.Model.Dealer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service

public class Service {

//    private List<Dealer> dealers=new ArrayList<>();
//    public void add(Dealer dealer) {
//        dealers.add(dealer);
//    }
//    public List getall()
//    {
//        return dealers;
//    }
//    public void del(String dealer)
//    {
//        dealers.remove(dealers.stream().filter(p -> p.getName().equals(dealer)).findFirst().orElse(null));
//    }
    @Autowired
    private EntityRepository entityRepository;

    public void add(Dealer dealer)
    {
        DealerEntity dealerEntity1 =new DealerEntity();
        dealerEntity1.setName(dealer.getName());
        dealerEntity1.setPhone(dealer.getPhone());
        dealerEntity1.setOffice(dealer.getOffice());
        entityRepository.save(dealerEntity1);
    }
    public List getAll()
    {
        List<DealerEntity> customDetails = entityRepository.findAll();
        return customDetails.stream().map(x->getDealer(x)).collect(Collectors.toList());
    }
    private Dealer getDealer(DealerEntity dealerEntity2)
    {
        return new Dealer(dealerEntity2.getName(), dealerEntity2.getPhone(), dealerEntity2.getOffice());
    }
}
