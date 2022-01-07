package com.avinash.DbDemo.Repository;

import com.avinash.DbDemo.Entity.EntitySpecs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySpecs extends JpaRepository<EntitySpecs,Integer> {
}
