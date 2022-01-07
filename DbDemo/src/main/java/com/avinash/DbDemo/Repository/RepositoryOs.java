package com.avinash.DbDemo.Repository;

import com.avinash.DbDemo.Entity.EntityOs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOs extends JpaRepository<EntityOs,Integer> {
}
