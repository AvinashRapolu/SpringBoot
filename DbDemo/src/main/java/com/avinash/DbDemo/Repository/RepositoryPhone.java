package com.avinash.DbDemo.Repository;

import com.avinash.DbDemo.Entity.EntityPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPhone extends JpaRepository<EntityPhone,Integer> {
}
