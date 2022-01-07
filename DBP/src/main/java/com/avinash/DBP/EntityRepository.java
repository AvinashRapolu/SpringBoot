package com.avinash.DBP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntityRepository extends JpaRepository<PEntity,Integer> {
    Optional<PEntity> findByName(String name);
}
