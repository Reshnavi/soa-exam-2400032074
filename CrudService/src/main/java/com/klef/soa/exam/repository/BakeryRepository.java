package com.klef.soa.exam.repository;

import com.klef.soa.exam.entity.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}