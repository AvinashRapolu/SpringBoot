package com.avinash.DataBase.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface EntityRepository extends JpaRepository<DealerEntity, String>{

}